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

@Tag("36")
class Record_2233 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2233: FirstName is Chandra")
	void FirstNameOfRecord2233() {
		assertEquals("Chandra", customers.get(2232).getFirstName());
	}

	@Test
	@DisplayName("Record 2233: LastName is Rattliff")
	void LastNameOfRecord2233() {
		assertEquals("Rattliff", customers.get(2232).getLastName());
	}

	@Test
	@DisplayName("Record 2233: Company is Mobile Medical Services Inc")
	void CompanyOfRecord2233() {
		assertEquals("Mobile Medical Services Inc", customers.get(2232).getCompany());
	}

	@Test
	@DisplayName("Record 2233: Address is 513 Mountain View Ave")
	void AddressOfRecord2233() {
		assertEquals("513 Mountain View Ave", customers.get(2232).getAddress());
	}

	@Test
	@DisplayName("Record 2233: City is Belmont")
	void CityOfRecord2233() {
		assertEquals("Belmont", customers.get(2232).getCity());
	}

	@Test
	@DisplayName("Record 2233: County is San Mateo")
	void CountyOfRecord2233() {
		assertEquals("San Mateo", customers.get(2232).getCounty());
	}

	@Test
	@DisplayName("Record 2233: State is CA")
	void StateOfRecord2233() {
		assertEquals("CA", customers.get(2232).getState());
	}

	@Test
	@DisplayName("Record 2233: ZIP is 94002")
	void ZIPOfRecord2233() {
		assertEquals("94002", customers.get(2232).getZIP());
	}

	@Test
	@DisplayName("Record 2233: Phone is 650-593-8251")
	void PhoneOfRecord2233() {
		assertEquals("650-593-8251", customers.get(2232).getPhone());
	}

	@Test
	@DisplayName("Record 2233: Fax is 650-593-8447")
	void FaxOfRecord2233() {
		assertEquals("650-593-8447", customers.get(2232).getFax());
	}

	@Test
	@DisplayName("Record 2233: Email is chandra@rattliff.com")
	void EmailOfRecord2233() {
		assertEquals("chandra@rattliff.com", customers.get(2232).getEmail());
	}

	@Test
	@DisplayName("Record 2233: Web is http://www.chandrarattliff.com")
	void WebOfRecord2233() {
		assertEquals("http://www.chandrarattliff.com", customers.get(2232).getWeb());
	}
}
