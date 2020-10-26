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

@Tag("24")
class Record_2242 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2242: FirstName is yleen")
	void FirstNameOfRecord2242() {
		assertEquals("yleen", customers.get(2241).getFirstName());
	}

	@Test
	@DisplayName("Record 2242: LastName is Caluya")
	void LastNameOfRecord2242() {
		assertEquals("Caluya", customers.get(2241).getLastName());
	}

	@Test
	@DisplayName("Record 2242: Company is Mail Boxes Etc")
	void CompanyOfRecord2242() {
		assertEquals("Mail Boxes Etc", customers.get(2241).getCompany());
	}

	@Test
	@DisplayName("Record 2242: Address is 431 Welburn Ave")
	void AddressOfRecord2242() {
		assertEquals("431 Welburn Ave", customers.get(2241).getAddress());
	}

	@Test
	@DisplayName("Record 2242: City is Gilroy")
	void CityOfRecord2242() {
		assertEquals("Gilroy", customers.get(2241).getCity());
	}

	@Test
	@DisplayName("Record 2242: County is Santa Clara")
	void CountyOfRecord2242() {
		assertEquals("Santa Clara", customers.get(2241).getCounty());
	}

	@Test
	@DisplayName("Record 2242: State is CA")
	void StateOfRecord2242() {
		assertEquals("CA", customers.get(2241).getState());
	}

	@Test
	@DisplayName("Record 2242: ZIP is 95020")
	void ZIPOfRecord2242() {
		assertEquals("95020", customers.get(2241).getZIP());
	}

	@Test
	@DisplayName("Record 2242: Phone is 408-842-1893")
	void PhoneOfRecord2242() {
		assertEquals("408-842-1893", customers.get(2241).getPhone());
	}

	@Test
	@DisplayName("Record 2242: Fax is 408-842-8147")
	void FaxOfRecord2242() {
		assertEquals("408-842-8147", customers.get(2241).getFax());
	}

	@Test
	@DisplayName("Record 2242: Email is yleen@caluya.com")
	void EmailOfRecord2242() {
		assertEquals("yleen@caluya.com", customers.get(2241).getEmail());
	}

	@Test
	@DisplayName("Record 2242: Web is http://www.yleencaluya.com")
	void WebOfRecord2242() {
		assertEquals("http://www.yleencaluya.com", customers.get(2241).getWeb());
	}
}
