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

@Tag("32")
class Record_3441 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3441: FirstName is Vern")
	void FirstNameOfRecord3441() {
		assertEquals("Vern", customers.get(3440).getFirstName());
	}

	@Test
	@DisplayName("Record 3441: LastName is Mill")
	void LastNameOfRecord3441() {
		assertEquals("Mill", customers.get(3440).getLastName());
	}

	@Test
	@DisplayName("Record 3441: Company is Frost & Associates")
	void CompanyOfRecord3441() {
		assertEquals("Frost & Associates", customers.get(3440).getCompany());
	}

	@Test
	@DisplayName("Record 3441: Address is Rte 422e E Rd 6")
	void AddressOfRecord3441() {
		assertEquals("Rte 422e E Rd 6", customers.get(3440).getAddress());
	}

	@Test
	@DisplayName("Record 3441: City is New Castle")
	void CityOfRecord3441() {
		assertEquals("New Castle", customers.get(3440).getCity());
	}

	@Test
	@DisplayName("Record 3441: County is Lawrence")
	void CountyOfRecord3441() {
		assertEquals("Lawrence", customers.get(3440).getCounty());
	}

	@Test
	@DisplayName("Record 3441: State is PA")
	void StateOfRecord3441() {
		assertEquals("PA", customers.get(3440).getState());
	}

	@Test
	@DisplayName("Record 3441: ZIP is 16101")
	void ZIPOfRecord3441() {
		assertEquals("16101", customers.get(3440).getZIP());
	}

	@Test
	@DisplayName("Record 3441: Phone is 724-924-1928")
	void PhoneOfRecord3441() {
		assertEquals("724-924-1928", customers.get(3440).getPhone());
	}

	@Test
	@DisplayName("Record 3441: Fax is 724-924-6761")
	void FaxOfRecord3441() {
		assertEquals("724-924-6761", customers.get(3440).getFax());
	}

	@Test
	@DisplayName("Record 3441: Email is vern@mill.com")
	void EmailOfRecord3441() {
		assertEquals("vern@mill.com", customers.get(3440).getEmail());
	}

	@Test
	@DisplayName("Record 3441: Web is http://www.vernmill.com")
	void WebOfRecord3441() {
		assertEquals("http://www.vernmill.com", customers.get(3440).getWeb());
	}
}
