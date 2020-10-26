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

@Tag("3")
class Record_2792 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2792: FirstName is Genevieve")
	void FirstNameOfRecord2792() {
		assertEquals("Genevieve", customers.get(2791).getFirstName());
	}

	@Test
	@DisplayName("Record 2792: LastName is Posse")
	void LastNameOfRecord2792() {
		assertEquals("Posse", customers.get(2791).getLastName());
	}

	@Test
	@DisplayName("Record 2792: Company is Roth Paris Marketing Assocs")
	void CompanyOfRecord2792() {
		assertEquals("Roth Paris Marketing Assocs", customers.get(2791).getCompany());
	}

	@Test
	@DisplayName("Record 2792: Address is 2121 W Virginia Ave Ne")
	void AddressOfRecord2792() {
		assertEquals("2121 W Virginia Ave Ne", customers.get(2791).getAddress());
	}

	@Test
	@DisplayName("Record 2792: City is Washington")
	void CityOfRecord2792() {
		assertEquals("Washington", customers.get(2791).getCity());
	}

	@Test
	@DisplayName("Record 2792: County is District of Columbia")
	void CountyOfRecord2792() {
		assertEquals("District of Columbia", customers.get(2791).getCounty());
	}

	@Test
	@DisplayName("Record 2792: State is DC")
	void StateOfRecord2792() {
		assertEquals("DC", customers.get(2791).getState());
	}

	@Test
	@DisplayName("Record 2792: ZIP is 20002")
	void ZIPOfRecord2792() {
		assertEquals("20002", customers.get(2791).getZIP());
	}

	@Test
	@DisplayName("Record 2792: Phone is 202-526-3372")
	void PhoneOfRecord2792() {
		assertEquals("202-526-3372", customers.get(2791).getPhone());
	}

	@Test
	@DisplayName("Record 2792: Fax is 202-526-7373")
	void FaxOfRecord2792() {
		assertEquals("202-526-7373", customers.get(2791).getFax());
	}

	@Test
	@DisplayName("Record 2792: Email is genevieve@posse.com")
	void EmailOfRecord2792() {
		assertEquals("genevieve@posse.com", customers.get(2791).getEmail());
	}

	@Test
	@DisplayName("Record 2792: Web is http://www.genevieveposse.com")
	void WebOfRecord2792() {
		assertEquals("http://www.genevieveposse.com", customers.get(2791).getWeb());
	}
}
