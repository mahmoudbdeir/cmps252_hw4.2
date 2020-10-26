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

@Tag("37")
class Record_3690 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3690: FirstName is Terrie")
	void FirstNameOfRecord3690() {
		assertEquals("Terrie", customers.get(3689).getFirstName());
	}

	@Test
	@DisplayName("Record 3690: LastName is Spotwood")
	void LastNameOfRecord3690() {
		assertEquals("Spotwood", customers.get(3689).getLastName());
	}

	@Test
	@DisplayName("Record 3690: Company is Vinyl Solution Records & Tapes")
	void CompanyOfRecord3690() {
		assertEquals("Vinyl Solution Records & Tapes", customers.get(3689).getCompany());
	}

	@Test
	@DisplayName("Record 3690: Address is 2 Vernon St")
	void AddressOfRecord3690() {
		assertEquals("2 Vernon St", customers.get(3689).getAddress());
	}

	@Test
	@DisplayName("Record 3690: City is Framingham")
	void CityOfRecord3690() {
		assertEquals("Framingham", customers.get(3689).getCity());
	}

	@Test
	@DisplayName("Record 3690: County is Middlesex")
	void CountyOfRecord3690() {
		assertEquals("Middlesex", customers.get(3689).getCounty());
	}

	@Test
	@DisplayName("Record 3690: State is MA")
	void StateOfRecord3690() {
		assertEquals("MA", customers.get(3689).getState());
	}

	@Test
	@DisplayName("Record 3690: ZIP is 1701")
	void ZIPOfRecord3690() {
		assertEquals("1701", customers.get(3689).getZIP());
	}

	@Test
	@DisplayName("Record 3690: Phone is 508-875-3928")
	void PhoneOfRecord3690() {
		assertEquals("508-875-3928", customers.get(3689).getPhone());
	}

	@Test
	@DisplayName("Record 3690: Fax is 508-875-6684")
	void FaxOfRecord3690() {
		assertEquals("508-875-6684", customers.get(3689).getFax());
	}

	@Test
	@DisplayName("Record 3690: Email is terrie@spotwood.com")
	void EmailOfRecord3690() {
		assertEquals("terrie@spotwood.com", customers.get(3689).getEmail());
	}

	@Test
	@DisplayName("Record 3690: Web is http://www.terriespotwood.com")
	void WebOfRecord3690() {
		assertEquals("http://www.terriespotwood.com", customers.get(3689).getWeb());
	}
}
