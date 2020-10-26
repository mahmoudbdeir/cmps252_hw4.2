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

@Tag("20")
class Record_2188 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2188: FirstName is Jimmie")
	void FirstNameOfRecord2188() {
		assertEquals("Jimmie", customers.get(2187).getFirstName());
	}

	@Test
	@DisplayName("Record 2188: LastName is Pavese")
	void LastNameOfRecord2188() {
		assertEquals("Pavese", customers.get(2187).getLastName());
	}

	@Test
	@DisplayName("Record 2188: Company is Adm Corn Processing")
	void CompanyOfRecord2188() {
		assertEquals("Adm Corn Processing", customers.get(2187).getCompany());
	}

	@Test
	@DisplayName("Record 2188: Address is 430 E 3rd St")
	void AddressOfRecord2188() {
		assertEquals("430 E 3rd St", customers.get(2187).getAddress());
	}

	@Test
	@DisplayName("Record 2188: City is The Dalles")
	void CityOfRecord2188() {
		assertEquals("The Dalles", customers.get(2187).getCity());
	}

	@Test
	@DisplayName("Record 2188: County is Wasco")
	void CountyOfRecord2188() {
		assertEquals("Wasco", customers.get(2187).getCounty());
	}

	@Test
	@DisplayName("Record 2188: State is OR")
	void StateOfRecord2188() {
		assertEquals("OR", customers.get(2187).getState());
	}

	@Test
	@DisplayName("Record 2188: ZIP is 97058")
	void ZIPOfRecord2188() {
		assertEquals("97058", customers.get(2187).getZIP());
	}

	@Test
	@DisplayName("Record 2188: Phone is 541-296-7244")
	void PhoneOfRecord2188() {
		assertEquals("541-296-7244", customers.get(2187).getPhone());
	}

	@Test
	@DisplayName("Record 2188: Fax is 541-296-5297")
	void FaxOfRecord2188() {
		assertEquals("541-296-5297", customers.get(2187).getFax());
	}

	@Test
	@DisplayName("Record 2188: Email is jimmie@pavese.com")
	void EmailOfRecord2188() {
		assertEquals("jimmie@pavese.com", customers.get(2187).getEmail());
	}

	@Test
	@DisplayName("Record 2188: Web is http://www.jimmiepavese.com")
	void WebOfRecord2188() {
		assertEquals("http://www.jimmiepavese.com", customers.get(2187).getWeb());
	}
}
