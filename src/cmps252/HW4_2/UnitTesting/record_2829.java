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

@Tag("31")
class Record_2829 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2829: FirstName is Lois")
	void FirstNameOfRecord2829() {
		assertEquals("Lois", customers.get(2828).getFirstName());
	}

	@Test
	@DisplayName("Record 2829: LastName is Ruozzo")
	void LastNameOfRecord2829() {
		assertEquals("Ruozzo", customers.get(2828).getLastName());
	}

	@Test
	@DisplayName("Record 2829: Company is Cam Graphics Inc")
	void CompanyOfRecord2829() {
		assertEquals("Cam Graphics Inc", customers.get(2828).getCompany());
	}

	@Test
	@DisplayName("Record 2829: Address is 128 W Central Ave")
	void AddressOfRecord2829() {
		assertEquals("128 W Central Ave", customers.get(2828).getAddress());
	}

	@Test
	@DisplayName("Record 2829: City is Valdosta")
	void CityOfRecord2829() {
		assertEquals("Valdosta", customers.get(2828).getCity());
	}

	@Test
	@DisplayName("Record 2829: County is Lowndes")
	void CountyOfRecord2829() {
		assertEquals("Lowndes", customers.get(2828).getCounty());
	}

	@Test
	@DisplayName("Record 2829: State is GA")
	void StateOfRecord2829() {
		assertEquals("GA", customers.get(2828).getState());
	}

	@Test
	@DisplayName("Record 2829: ZIP is 31601")
	void ZIPOfRecord2829() {
		assertEquals("31601", customers.get(2828).getZIP());
	}

	@Test
	@DisplayName("Record 2829: Phone is 229-244-5832")
	void PhoneOfRecord2829() {
		assertEquals("229-244-5832", customers.get(2828).getPhone());
	}

	@Test
	@DisplayName("Record 2829: Fax is 229-244-4608")
	void FaxOfRecord2829() {
		assertEquals("229-244-4608", customers.get(2828).getFax());
	}

	@Test
	@DisplayName("Record 2829: Email is lois@ruozzo.com")
	void EmailOfRecord2829() {
		assertEquals("lois@ruozzo.com", customers.get(2828).getEmail());
	}

	@Test
	@DisplayName("Record 2829: Web is http://www.loisruozzo.com")
	void WebOfRecord2829() {
		assertEquals("http://www.loisruozzo.com", customers.get(2828).getWeb());
	}
}
