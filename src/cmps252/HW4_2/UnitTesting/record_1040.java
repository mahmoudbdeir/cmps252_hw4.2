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

@Tag("48")
class Record_1040 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1040: FirstName is Lindsay")
	void FirstNameOfRecord1040() {
		assertEquals("Lindsay", customers.get(1039).getFirstName());
	}

	@Test
	@DisplayName("Record 1040: LastName is Syfts")
	void LastNameOfRecord1040() {
		assertEquals("Syfts", customers.get(1039).getLastName());
	}

	@Test
	@DisplayName("Record 1040: Company is Brock, D Glenn Esq")
	void CompanyOfRecord1040() {
		assertEquals("Brock, D Glenn Esq", customers.get(1039).getCompany());
	}

	@Test
	@DisplayName("Record 1040: Address is 1330 Howard St")
	void AddressOfRecord1040() {
		assertEquals("1330 Howard St", customers.get(1039).getAddress());
	}

	@Test
	@DisplayName("Record 1040: City is San Francisco")
	void CityOfRecord1040() {
		assertEquals("San Francisco", customers.get(1039).getCity());
	}

	@Test
	@DisplayName("Record 1040: County is San Francisco")
	void CountyOfRecord1040() {
		assertEquals("San Francisco", customers.get(1039).getCounty());
	}

	@Test
	@DisplayName("Record 1040: State is CA")
	void StateOfRecord1040() {
		assertEquals("CA", customers.get(1039).getState());
	}

	@Test
	@DisplayName("Record 1040: ZIP is 94103")
	void ZIPOfRecord1040() {
		assertEquals("94103", customers.get(1039).getZIP());
	}

	@Test
	@DisplayName("Record 1040: Phone is 415-621-5702")
	void PhoneOfRecord1040() {
		assertEquals("415-621-5702", customers.get(1039).getPhone());
	}

	@Test
	@DisplayName("Record 1040: Fax is 415-621-0237")
	void FaxOfRecord1040() {
		assertEquals("415-621-0237", customers.get(1039).getFax());
	}

	@Test
	@DisplayName("Record 1040: Email is lindsay@syfts.com")
	void EmailOfRecord1040() {
		assertEquals("lindsay@syfts.com", customers.get(1039).getEmail());
	}

	@Test
	@DisplayName("Record 1040: Web is http://www.lindsaysyfts.com")
	void WebOfRecord1040() {
		assertEquals("http://www.lindsaysyfts.com", customers.get(1039).getWeb());
	}
}
