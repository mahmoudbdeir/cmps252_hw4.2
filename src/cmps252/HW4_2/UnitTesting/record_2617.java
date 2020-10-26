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

@Tag("8")
class Record_2617 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2617: FirstName is Kelley")
	void FirstNameOfRecord2617() {
		assertEquals("Kelley", customers.get(2616).getFirstName());
	}

	@Test
	@DisplayName("Record 2617: LastName is Seago")
	void LastNameOfRecord2617() {
		assertEquals("Seago", customers.get(2616).getLastName());
	}

	@Test
	@DisplayName("Record 2617: Company is Kwik Kopy Printing")
	void CompanyOfRecord2617() {
		assertEquals("Kwik Kopy Printing", customers.get(2616).getCompany());
	}

	@Test
	@DisplayName("Record 2617: Address is 833 E Badillo St")
	void AddressOfRecord2617() {
		assertEquals("833 E Badillo St", customers.get(2616).getAddress());
	}

	@Test
	@DisplayName("Record 2617: City is Covina")
	void CityOfRecord2617() {
		assertEquals("Covina", customers.get(2616).getCity());
	}

	@Test
	@DisplayName("Record 2617: County is Los Angeles")
	void CountyOfRecord2617() {
		assertEquals("Los Angeles", customers.get(2616).getCounty());
	}

	@Test
	@DisplayName("Record 2617: State is CA")
	void StateOfRecord2617() {
		assertEquals("CA", customers.get(2616).getState());
	}

	@Test
	@DisplayName("Record 2617: ZIP is 91723")
	void ZIPOfRecord2617() {
		assertEquals("91723", customers.get(2616).getZIP());
	}

	@Test
	@DisplayName("Record 2617: Phone is 626-339-6662")
	void PhoneOfRecord2617() {
		assertEquals("626-339-6662", customers.get(2616).getPhone());
	}

	@Test
	@DisplayName("Record 2617: Fax is 626-339-3883")
	void FaxOfRecord2617() {
		assertEquals("626-339-3883", customers.get(2616).getFax());
	}

	@Test
	@DisplayName("Record 2617: Email is kelley@seago.com")
	void EmailOfRecord2617() {
		assertEquals("kelley@seago.com", customers.get(2616).getEmail());
	}

	@Test
	@DisplayName("Record 2617: Web is http://www.kelleyseago.com")
	void WebOfRecord2617() {
		assertEquals("http://www.kelleyseago.com", customers.get(2616).getWeb());
	}
}
