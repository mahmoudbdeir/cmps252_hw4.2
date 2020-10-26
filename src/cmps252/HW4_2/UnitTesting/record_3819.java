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
class Record_3819 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3819: FirstName is Lorenzo")
	void FirstNameOfRecord3819() {
		assertEquals("Lorenzo", customers.get(3818).getFirstName());
	}

	@Test
	@DisplayName("Record 3819: LastName is Deveja")
	void LastNameOfRecord3819() {
		assertEquals("Deveja", customers.get(3818).getLastName());
	}

	@Test
	@DisplayName("Record 3819: Company is Mr Ks South Tx Htg & Air Cond")
	void CompanyOfRecord3819() {
		assertEquals("Mr Ks South Tx Htg & Air Cond", customers.get(3818).getCompany());
	}

	@Test
	@DisplayName("Record 3819: Address is 495 San Mateo Ave")
	void AddressOfRecord3819() {
		assertEquals("495 San Mateo Ave", customers.get(3818).getAddress());
	}

	@Test
	@DisplayName("Record 3819: City is San Bruno")
	void CityOfRecord3819() {
		assertEquals("San Bruno", customers.get(3818).getCity());
	}

	@Test
	@DisplayName("Record 3819: County is San Mateo")
	void CountyOfRecord3819() {
		assertEquals("San Mateo", customers.get(3818).getCounty());
	}

	@Test
	@DisplayName("Record 3819: State is CA")
	void StateOfRecord3819() {
		assertEquals("CA", customers.get(3818).getState());
	}

	@Test
	@DisplayName("Record 3819: ZIP is 94066")
	void ZIPOfRecord3819() {
		assertEquals("94066", customers.get(3818).getZIP());
	}

	@Test
	@DisplayName("Record 3819: Phone is 650-589-0688")
	void PhoneOfRecord3819() {
		assertEquals("650-589-0688", customers.get(3818).getPhone());
	}

	@Test
	@DisplayName("Record 3819: Fax is 650-589-9528")
	void FaxOfRecord3819() {
		assertEquals("650-589-9528", customers.get(3818).getFax());
	}

	@Test
	@DisplayName("Record 3819: Email is lorenzo@deveja.com")
	void EmailOfRecord3819() {
		assertEquals("lorenzo@deveja.com", customers.get(3818).getEmail());
	}

	@Test
	@DisplayName("Record 3819: Web is http://www.lorenzodeveja.com")
	void WebOfRecord3819() {
		assertEquals("http://www.lorenzodeveja.com", customers.get(3818).getWeb());
	}
}
