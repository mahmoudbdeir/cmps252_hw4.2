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

@Tag("17")
class Record_2455 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2455: FirstName is Earnestine")
	void FirstNameOfRecord2455() {
		assertEquals("Earnestine", customers.get(2454).getFirstName());
	}

	@Test
	@DisplayName("Record 2455: LastName is Falkenthal")
	void LastNameOfRecord2455() {
		assertEquals("Falkenthal", customers.get(2454).getLastName());
	}

	@Test
	@DisplayName("Record 2455: Company is Khbm Radio Monticello")
	void CompanyOfRecord2455() {
		assertEquals("Khbm Radio Monticello", customers.get(2454).getCompany());
	}

	@Test
	@DisplayName("Record 2455: Address is 2600 W Olive Ave")
	void AddressOfRecord2455() {
		assertEquals("2600 W Olive Ave", customers.get(2454).getAddress());
	}

	@Test
	@DisplayName("Record 2455: City is Burbank")
	void CityOfRecord2455() {
		assertEquals("Burbank", customers.get(2454).getCity());
	}

	@Test
	@DisplayName("Record 2455: County is Los Angeles")
	void CountyOfRecord2455() {
		assertEquals("Los Angeles", customers.get(2454).getCounty());
	}

	@Test
	@DisplayName("Record 2455: State is CA")
	void StateOfRecord2455() {
		assertEquals("CA", customers.get(2454).getState());
	}

	@Test
	@DisplayName("Record 2455: ZIP is 91505")
	void ZIPOfRecord2455() {
		assertEquals("91505", customers.get(2454).getZIP());
	}

	@Test
	@DisplayName("Record 2455: Phone is 818-569-1768")
	void PhoneOfRecord2455() {
		assertEquals("818-569-1768", customers.get(2454).getPhone());
	}

	@Test
	@DisplayName("Record 2455: Fax is 818-569-9577")
	void FaxOfRecord2455() {
		assertEquals("818-569-9577", customers.get(2454).getFax());
	}

	@Test
	@DisplayName("Record 2455: Email is earnestine@falkenthal.com")
	void EmailOfRecord2455() {
		assertEquals("earnestine@falkenthal.com", customers.get(2454).getEmail());
	}

	@Test
	@DisplayName("Record 2455: Web is http://www.earnestinefalkenthal.com")
	void WebOfRecord2455() {
		assertEquals("http://www.earnestinefalkenthal.com", customers.get(2454).getWeb());
	}
}
