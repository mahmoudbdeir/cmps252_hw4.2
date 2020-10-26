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
class Record_2435 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2435: FirstName is Thad")
	void FirstNameOfRecord2435() {
		assertEquals("Thad", customers.get(2434).getFirstName());
	}

	@Test
	@DisplayName("Record 2435: LastName is Kemper")
	void LastNameOfRecord2435() {
		assertEquals("Kemper", customers.get(2434).getLastName());
	}

	@Test
	@DisplayName("Record 2435: Company is Bender Goldman & Helper")
	void CompanyOfRecord2435() {
		assertEquals("Bender Goldman & Helper", customers.get(2434).getCompany());
	}

	@Test
	@DisplayName("Record 2435: Address is 9555 Folsom Blvd  #-j")
	void AddressOfRecord2435() {
		assertEquals("9555 Folsom Blvd  #-j", customers.get(2434).getAddress());
	}

	@Test
	@DisplayName("Record 2435: City is Sacramento")
	void CityOfRecord2435() {
		assertEquals("Sacramento", customers.get(2434).getCity());
	}

	@Test
	@DisplayName("Record 2435: County is Sacramento")
	void CountyOfRecord2435() {
		assertEquals("Sacramento", customers.get(2434).getCounty());
	}

	@Test
	@DisplayName("Record 2435: State is CA")
	void StateOfRecord2435() {
		assertEquals("CA", customers.get(2434).getState());
	}

	@Test
	@DisplayName("Record 2435: ZIP is 95827")
	void ZIPOfRecord2435() {
		assertEquals("95827", customers.get(2434).getZIP());
	}

	@Test
	@DisplayName("Record 2435: Phone is 916-368-2836")
	void PhoneOfRecord2435() {
		assertEquals("916-368-2836", customers.get(2434).getPhone());
	}

	@Test
	@DisplayName("Record 2435: Fax is 916-368-5606")
	void FaxOfRecord2435() {
		assertEquals("916-368-5606", customers.get(2434).getFax());
	}

	@Test
	@DisplayName("Record 2435: Email is thad@kemper.com")
	void EmailOfRecord2435() {
		assertEquals("thad@kemper.com", customers.get(2434).getEmail());
	}

	@Test
	@DisplayName("Record 2435: Web is http://www.thadkemper.com")
	void WebOfRecord2435() {
		assertEquals("http://www.thadkemper.com", customers.get(2434).getWeb());
	}
}
