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

@Tag("5")
class Record_4160 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4160: FirstName is Rickey")
	void FirstNameOfRecord4160() {
		assertEquals("Rickey", customers.get(4159).getFirstName());
	}

	@Test
	@DisplayName("Record 4160: LastName is Huffstetler")
	void LastNameOfRecord4160() {
		assertEquals("Huffstetler", customers.get(4159).getLastName());
	}

	@Test
	@DisplayName("Record 4160: Company is Burns, Gary W")
	void CompanyOfRecord4160() {
		assertEquals("Burns, Gary W", customers.get(4159).getCompany());
	}

	@Test
	@DisplayName("Record 4160: Address is 1130 Connecticut Ave Nw  #-500")
	void AddressOfRecord4160() {
		assertEquals("1130 Connecticut Ave Nw  #-500", customers.get(4159).getAddress());
	}

	@Test
	@DisplayName("Record 4160: City is Washington")
	void CityOfRecord4160() {
		assertEquals("Washington", customers.get(4159).getCity());
	}

	@Test
	@DisplayName("Record 4160: County is District of Columbia")
	void CountyOfRecord4160() {
		assertEquals("District of Columbia", customers.get(4159).getCounty());
	}

	@Test
	@DisplayName("Record 4160: State is DC")
	void StateOfRecord4160() {
		assertEquals("DC", customers.get(4159).getState());
	}

	@Test
	@DisplayName("Record 4160: ZIP is 20036")
	void ZIPOfRecord4160() {
		assertEquals("20036", customers.get(4159).getZIP());
	}

	@Test
	@DisplayName("Record 4160: Phone is 202-296-3106")
	void PhoneOfRecord4160() {
		assertEquals("202-296-3106", customers.get(4159).getPhone());
	}

	@Test
	@DisplayName("Record 4160: Fax is 202-296-0536")
	void FaxOfRecord4160() {
		assertEquals("202-296-0536", customers.get(4159).getFax());
	}

	@Test
	@DisplayName("Record 4160: Email is rickey@huffstetler.com")
	void EmailOfRecord4160() {
		assertEquals("rickey@huffstetler.com", customers.get(4159).getEmail());
	}

	@Test
	@DisplayName("Record 4160: Web is http://www.rickeyhuffstetler.com")
	void WebOfRecord4160() {
		assertEquals("http://www.rickeyhuffstetler.com", customers.get(4159).getWeb());
	}
}
