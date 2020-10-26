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
class Record_4772 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4772: FirstName is Winnie")
	void FirstNameOfRecord4772() {
		assertEquals("Winnie", customers.get(4771).getFirstName());
	}

	@Test
	@DisplayName("Record 4772: LastName is Signor")
	void LastNameOfRecord4772() {
		assertEquals("Signor", customers.get(4771).getLastName());
	}

	@Test
	@DisplayName("Record 4772: Company is Fairfield Inn")
	void CompanyOfRecord4772() {
		assertEquals("Fairfield Inn", customers.get(4771).getCompany());
	}

	@Test
	@DisplayName("Record 4772: Address is 2362 Qume Dr  #-b")
	void AddressOfRecord4772() {
		assertEquals("2362 Qume Dr  #-b", customers.get(4771).getAddress());
	}

	@Test
	@DisplayName("Record 4772: City is San Jose")
	void CityOfRecord4772() {
		assertEquals("San Jose", customers.get(4771).getCity());
	}

	@Test
	@DisplayName("Record 4772: County is Santa Clara")
	void CountyOfRecord4772() {
		assertEquals("Santa Clara", customers.get(4771).getCounty());
	}

	@Test
	@DisplayName("Record 4772: State is CA")
	void StateOfRecord4772() {
		assertEquals("CA", customers.get(4771).getState());
	}

	@Test
	@DisplayName("Record 4772: ZIP is 95131")
	void ZIPOfRecord4772() {
		assertEquals("95131", customers.get(4771).getZIP());
	}

	@Test
	@DisplayName("Record 4772: Phone is 408-435-1128")
	void PhoneOfRecord4772() {
		assertEquals("408-435-1128", customers.get(4771).getPhone());
	}

	@Test
	@DisplayName("Record 4772: Fax is 408-435-1258")
	void FaxOfRecord4772() {
		assertEquals("408-435-1258", customers.get(4771).getFax());
	}

	@Test
	@DisplayName("Record 4772: Email is winnie@signor.com")
	void EmailOfRecord4772() {
		assertEquals("winnie@signor.com", customers.get(4771).getEmail());
	}

	@Test
	@DisplayName("Record 4772: Web is http://www.winniesignor.com")
	void WebOfRecord4772() {
		assertEquals("http://www.winniesignor.com", customers.get(4771).getWeb());
	}
}
