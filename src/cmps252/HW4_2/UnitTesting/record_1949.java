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

@Tag("40")
class Record_1949 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1949: FirstName is Robbin")
	void FirstNameOfRecord1949() {
		assertEquals("Robbin", customers.get(1948).getFirstName());
	}

	@Test
	@DisplayName("Record 1949: LastName is Puyear")
	void LastNameOfRecord1949() {
		assertEquals("Puyear", customers.get(1948).getLastName());
	}

	@Test
	@DisplayName("Record 1949: Company is Raup, Calvin L Esq")
	void CompanyOfRecord1949() {
		assertEquals("Raup, Calvin L Esq", customers.get(1948).getCompany());
	}

	@Test
	@DisplayName("Record 1949: Address is 2697 Halladay St")
	void AddressOfRecord1949() {
		assertEquals("2697 Halladay St", customers.get(1948).getAddress());
	}

	@Test
	@DisplayName("Record 1949: City is Santa Ana")
	void CityOfRecord1949() {
		assertEquals("Santa Ana", customers.get(1948).getCity());
	}

	@Test
	@DisplayName("Record 1949: County is Orange")
	void CountyOfRecord1949() {
		assertEquals("Orange", customers.get(1948).getCounty());
	}

	@Test
	@DisplayName("Record 1949: State is CA")
	void StateOfRecord1949() {
		assertEquals("CA", customers.get(1948).getState());
	}

	@Test
	@DisplayName("Record 1949: ZIP is 92705")
	void ZIPOfRecord1949() {
		assertEquals("92705", customers.get(1948).getZIP());
	}

	@Test
	@DisplayName("Record 1949: Phone is 714-979-9840")
	void PhoneOfRecord1949() {
		assertEquals("714-979-9840", customers.get(1948).getPhone());
	}

	@Test
	@DisplayName("Record 1949: Fax is 714-979-8485")
	void FaxOfRecord1949() {
		assertEquals("714-979-8485", customers.get(1948).getFax());
	}

	@Test
	@DisplayName("Record 1949: Email is robbin@puyear.com")
	void EmailOfRecord1949() {
		assertEquals("robbin@puyear.com", customers.get(1948).getEmail());
	}

	@Test
	@DisplayName("Record 1949: Web is http://www.robbinpuyear.com")
	void WebOfRecord1949() {
		assertEquals("http://www.robbinpuyear.com", customers.get(1948).getWeb());
	}
}
