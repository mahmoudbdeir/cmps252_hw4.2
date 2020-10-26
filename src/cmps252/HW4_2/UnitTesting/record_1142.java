package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("41")
class Record_1142 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1142: FirstName is Elaine")
	void FirstNameOfRecord1142() {
		assertEquals("Elaine", customers.get(1141).getFirstName());
	}

	@Test
	@DisplayName("Record 1142: LastName is Corren")
	void LastNameOfRecord1142() {
		assertEquals("Corren", customers.get(1141).getLastName());
	}

	@Test
	@DisplayName("Record 1142: Company is Blades, Lawrence E Esq")
	void CompanyOfRecord1142() {
		assertEquals("Blades, Lawrence E Esq", customers.get(1141).getCompany());
	}

	@Test
	@DisplayName("Record 1142: Address is 401 Race St")
	void AddressOfRecord1142() {
		assertEquals("401 Race St", customers.get(1141).getAddress());
	}

	@Test
	@DisplayName("Record 1142: City is Cincinnati")
	void CityOfRecord1142() {
		assertEquals("Cincinnati", customers.get(1141).getCity());
	}

	@Test
	@DisplayName("Record 1142: County is Hamilton")
	void CountyOfRecord1142() {
		assertEquals("Hamilton", customers.get(1141).getCounty());
	}

	@Test
	@DisplayName("Record 1142: State is OH")
	void StateOfRecord1142() {
		assertEquals("OH", customers.get(1141).getState());
	}

	@Test
	@DisplayName("Record 1142: ZIP is 45202")
	void ZIPOfRecord1142() {
		assertEquals("45202", customers.get(1141).getZIP());
	}

	@Test
	@DisplayName("Record 1142: Phone is 513-762-7665")
	void PhoneOfRecord1142() {
		assertEquals("513-762-7665", customers.get(1141).getPhone());
	}

	@Test
	@DisplayName("Record 1142: Fax is 513-762-7069")
	void FaxOfRecord1142() {
		assertEquals("513-762-7069", customers.get(1141).getFax());
	}

	@Test
	@DisplayName("Record 1142: Email is elaine@corren.com")
	void EmailOfRecord1142() {
		assertEquals("elaine@corren.com", customers.get(1141).getEmail());
	}

	@Test
	@DisplayName("Record 1142: Web is http://www.elainecorren.com")
	void WebOfRecord1142() {
		assertEquals("http://www.elainecorren.com", customers.get(1141).getWeb());
	}
}
