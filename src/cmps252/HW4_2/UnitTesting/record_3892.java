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

@Tag("33")
class Record_3892 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3892: FirstName is Nora")
	void FirstNameOfRecord3892() {
		assertEquals("Nora", customers.get(3891).getFirstName());
	}

	@Test
	@DisplayName("Record 3892: LastName is Tikkanen")
	void LastNameOfRecord3892() {
		assertEquals("Tikkanen", customers.get(3891).getLastName());
	}

	@Test
	@DisplayName("Record 3892: Company is Kahn, Mitchel B Esq")
	void CompanyOfRecord3892() {
		assertEquals("Kahn, Mitchel B Esq", customers.get(3891).getCompany());
	}

	@Test
	@DisplayName("Record 3892: Address is 79 N Industrial Park")
	void AddressOfRecord3892() {
		assertEquals("79 N Industrial Park", customers.get(3891).getAddress());
	}

	@Test
	@DisplayName("Record 3892: City is Sewickley")
	void CityOfRecord3892() {
		assertEquals("Sewickley", customers.get(3891).getCity());
	}

	@Test
	@DisplayName("Record 3892: County is Allegheny")
	void CountyOfRecord3892() {
		assertEquals("Allegheny", customers.get(3891).getCounty());
	}

	@Test
	@DisplayName("Record 3892: State is PA")
	void StateOfRecord3892() {
		assertEquals("PA", customers.get(3891).getState());
	}

	@Test
	@DisplayName("Record 3892: ZIP is 15143")
	void ZIPOfRecord3892() {
		assertEquals("15143", customers.get(3891).getZIP());
	}

	@Test
	@DisplayName("Record 3892: Phone is 412-741-0052")
	void PhoneOfRecord3892() {
		assertEquals("412-741-0052", customers.get(3891).getPhone());
	}

	@Test
	@DisplayName("Record 3892: Fax is 412-741-3358")
	void FaxOfRecord3892() {
		assertEquals("412-741-3358", customers.get(3891).getFax());
	}

	@Test
	@DisplayName("Record 3892: Email is nora@tikkanen.com")
	void EmailOfRecord3892() {
		assertEquals("nora@tikkanen.com", customers.get(3891).getEmail());
	}

	@Test
	@DisplayName("Record 3892: Web is http://www.noratikkanen.com")
	void WebOfRecord3892() {
		assertEquals("http://www.noratikkanen.com", customers.get(3891).getWeb());
	}
}
