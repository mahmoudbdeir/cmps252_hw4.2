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

@Tag("25")
class Record_2505 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2505: FirstName is Maryjane")
	void FirstNameOfRecord2505() {
		assertEquals("Maryjane", customers.get(2504).getFirstName());
	}

	@Test
	@DisplayName("Record 2505: LastName is Radovich")
	void LastNameOfRecord2505() {
		assertEquals("Radovich", customers.get(2504).getLastName());
	}

	@Test
	@DisplayName("Record 2505: Company is Interamericas Investment Inc")
	void CompanyOfRecord2505() {
		assertEquals("Interamericas Investment Inc", customers.get(2504).getCompany());
	}

	@Test
	@DisplayName("Record 2505: Address is 900 Jackson Ave")
	void AddressOfRecord2505() {
		assertEquals("900 Jackson Ave", customers.get(2504).getAddress());
	}

	@Test
	@DisplayName("Record 2505: City is Saint Charles")
	void CityOfRecord2505() {
		assertEquals("Saint Charles", customers.get(2504).getCity());
	}

	@Test
	@DisplayName("Record 2505: County is Kane")
	void CountyOfRecord2505() {
		assertEquals("Kane", customers.get(2504).getCounty());
	}

	@Test
	@DisplayName("Record 2505: State is IL")
	void StateOfRecord2505() {
		assertEquals("IL", customers.get(2504).getState());
	}

	@Test
	@DisplayName("Record 2505: ZIP is 60174")
	void ZIPOfRecord2505() {
		assertEquals("60174", customers.get(2504).getZIP());
	}

	@Test
	@DisplayName("Record 2505: Phone is 630-377-3162")
	void PhoneOfRecord2505() {
		assertEquals("630-377-3162", customers.get(2504).getPhone());
	}

	@Test
	@DisplayName("Record 2505: Fax is 630-377-6564")
	void FaxOfRecord2505() {
		assertEquals("630-377-6564", customers.get(2504).getFax());
	}

	@Test
	@DisplayName("Record 2505: Email is maryjane@radovich.com")
	void EmailOfRecord2505() {
		assertEquals("maryjane@radovich.com", customers.get(2504).getEmail());
	}

	@Test
	@DisplayName("Record 2505: Web is http://www.maryjaneradovich.com")
	void WebOfRecord2505() {
		assertEquals("http://www.maryjaneradovich.com", customers.get(2504).getWeb());
	}
}
