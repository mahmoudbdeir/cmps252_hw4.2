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

@Tag("45")
class Record_3910 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3910: FirstName is Chris")
	void FirstNameOfRecord3910() {
		assertEquals("Chris", customers.get(3909).getFirstName());
	}

	@Test
	@DisplayName("Record 3910: LastName is Lavgle")
	void LastNameOfRecord3910() {
		assertEquals("Lavgle", customers.get(3909).getLastName());
	}

	@Test
	@DisplayName("Record 3910: Company is Realty Brokerage")
	void CompanyOfRecord3910() {
		assertEquals("Realty Brokerage", customers.get(3909).getCompany());
	}

	@Test
	@DisplayName("Record 3910: Address is 5400 Bosque Blvd  #-500")
	void AddressOfRecord3910() {
		assertEquals("5400 Bosque Blvd  #-500", customers.get(3909).getAddress());
	}

	@Test
	@DisplayName("Record 3910: City is Waco")
	void CityOfRecord3910() {
		assertEquals("Waco", customers.get(3909).getCity());
	}

	@Test
	@DisplayName("Record 3910: County is McLennan")
	void CountyOfRecord3910() {
		assertEquals("McLennan", customers.get(3909).getCounty());
	}

	@Test
	@DisplayName("Record 3910: State is TX")
	void StateOfRecord3910() {
		assertEquals("TX", customers.get(3909).getState());
	}

	@Test
	@DisplayName("Record 3910: ZIP is 76710")
	void ZIPOfRecord3910() {
		assertEquals("76710", customers.get(3909).getZIP());
	}

	@Test
	@DisplayName("Record 3910: Phone is 254-776-3877")
	void PhoneOfRecord3910() {
		assertEquals("254-776-3877", customers.get(3909).getPhone());
	}

	@Test
	@DisplayName("Record 3910: Fax is 254-776-2233")
	void FaxOfRecord3910() {
		assertEquals("254-776-2233", customers.get(3909).getFax());
	}

	@Test
	@DisplayName("Record 3910: Email is chris@lavgle.com")
	void EmailOfRecord3910() {
		assertEquals("chris@lavgle.com", customers.get(3909).getEmail());
	}

	@Test
	@DisplayName("Record 3910: Web is http://www.chrislavgle.com")
	void WebOfRecord3910() {
		assertEquals("http://www.chrislavgle.com", customers.get(3909).getWeb());
	}
}
