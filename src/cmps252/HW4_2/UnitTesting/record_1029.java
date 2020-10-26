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

@Tag("6")
class Record_1029 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1029: FirstName is Jose")
	void FirstNameOfRecord1029() {
		assertEquals("Jose", customers.get(1028).getFirstName());
	}

	@Test
	@DisplayName("Record 1029: LastName is Deppe")
	void LastNameOfRecord1029() {
		assertEquals("Deppe", customers.get(1028).getLastName());
	}

	@Test
	@DisplayName("Record 1029: Company is Finberg, James M Esq")
	void CompanyOfRecord1029() {
		assertEquals("Finberg, James M Esq", customers.get(1028).getCompany());
	}

	@Test
	@DisplayName("Record 1029: Address is Pineywoods Rd")
	void AddressOfRecord1029() {
		assertEquals("Pineywoods Rd", customers.get(1028).getAddress());
	}

	@Test
	@DisplayName("Record 1029: City is Jasper")
	void CityOfRecord1029() {
		assertEquals("Jasper", customers.get(1028).getCity());
	}

	@Test
	@DisplayName("Record 1029: County is Walker")
	void CountyOfRecord1029() {
		assertEquals("Walker", customers.get(1028).getCounty());
	}

	@Test
	@DisplayName("Record 1029: State is AL")
	void StateOfRecord1029() {
		assertEquals("AL", customers.get(1028).getState());
	}

	@Test
	@DisplayName("Record 1029: ZIP is 35501")
	void ZIPOfRecord1029() {
		assertEquals("35501", customers.get(1028).getZIP());
	}

	@Test
	@DisplayName("Record 1029: Phone is 205-384-8097")
	void PhoneOfRecord1029() {
		assertEquals("205-384-8097", customers.get(1028).getPhone());
	}

	@Test
	@DisplayName("Record 1029: Fax is 205-384-3154")
	void FaxOfRecord1029() {
		assertEquals("205-384-3154", customers.get(1028).getFax());
	}

	@Test
	@DisplayName("Record 1029: Email is jose@deppe.com")
	void EmailOfRecord1029() {
		assertEquals("jose@deppe.com", customers.get(1028).getEmail());
	}

	@Test
	@DisplayName("Record 1029: Web is http://www.josedeppe.com")
	void WebOfRecord1029() {
		assertEquals("http://www.josedeppe.com", customers.get(1028).getWeb());
	}
}
