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

@Tag("38")
class Record_2467 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2467: FirstName is Tabitha")
	void FirstNameOfRecord2467() {
		assertEquals("Tabitha", customers.get(2466).getFirstName());
	}

	@Test
	@DisplayName("Record 2467: LastName is Zomorodi")
	void LastNameOfRecord2467() {
		assertEquals("Zomorodi", customers.get(2466).getLastName());
	}

	@Test
	@DisplayName("Record 2467: Company is Topcraft Industries")
	void CompanyOfRecord2467() {
		assertEquals("Topcraft Industries", customers.get(2466).getCompany());
	}

	@Test
	@DisplayName("Record 2467: Address is 1 Steel Ct")
	void AddressOfRecord2467() {
		assertEquals("1 Steel Ct", customers.get(2466).getAddress());
	}

	@Test
	@DisplayName("Record 2467: City is Roseland")
	void CityOfRecord2467() {
		assertEquals("Roseland", customers.get(2466).getCity());
	}

	@Test
	@DisplayName("Record 2467: County is Essex")
	void CountyOfRecord2467() {
		assertEquals("Essex", customers.get(2466).getCounty());
	}

	@Test
	@DisplayName("Record 2467: State is NJ")
	void StateOfRecord2467() {
		assertEquals("NJ", customers.get(2466).getState());
	}

	@Test
	@DisplayName("Record 2467: ZIP is 7068")
	void ZIPOfRecord2467() {
		assertEquals("7068", customers.get(2466).getZIP());
	}

	@Test
	@DisplayName("Record 2467: Phone is 973-228-5240")
	void PhoneOfRecord2467() {
		assertEquals("973-228-5240", customers.get(2466).getPhone());
	}

	@Test
	@DisplayName("Record 2467: Fax is 973-228-8856")
	void FaxOfRecord2467() {
		assertEquals("973-228-8856", customers.get(2466).getFax());
	}

	@Test
	@DisplayName("Record 2467: Email is tabitha@zomorodi.com")
	void EmailOfRecord2467() {
		assertEquals("tabitha@zomorodi.com", customers.get(2466).getEmail());
	}

	@Test
	@DisplayName("Record 2467: Web is http://www.tabithazomorodi.com")
	void WebOfRecord2467() {
		assertEquals("http://www.tabithazomorodi.com", customers.get(2466).getWeb());
	}
}
