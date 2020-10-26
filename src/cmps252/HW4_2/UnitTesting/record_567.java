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
class Record_567 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 567: FirstName is Melisa")
	void FirstNameOfRecord567() {
		assertEquals("Melisa", customers.get(566).getFirstName());
	}

	@Test
	@DisplayName("Record 567: LastName is Yoneoka")
	void LastNameOfRecord567() {
		assertEquals("Yoneoka", customers.get(566).getLastName());
	}

	@Test
	@DisplayName("Record 567: Company is Acqua Group Commercial Of Az")
	void CompanyOfRecord567() {
		assertEquals("Acqua Group Commercial Of Az", customers.get(566).getCompany());
	}

	@Test
	@DisplayName("Record 567: Address is 2898 E Miraloma Ave")
	void AddressOfRecord567() {
		assertEquals("2898 E Miraloma Ave", customers.get(566).getAddress());
	}

	@Test
	@DisplayName("Record 567: City is Anahym")
	void CityOfRecord567() {
		assertEquals("Anahym", customers.get(566).getCity());
	}

	@Test
	@DisplayName("Record 567: County is Orange")
	void CountyOfRecord567() {
		assertEquals("Orange", customers.get(566).getCounty());
	}

	@Test
	@DisplayName("Record 567: State is CA")
	void StateOfRecord567() {
		assertEquals("CA", customers.get(566).getState());
	}

	@Test
	@DisplayName("Record 567: ZIP is 92806")
	void ZIPOfRecord567() {
		assertEquals("92806", customers.get(566).getZIP());
	}

	@Test
	@DisplayName("Record 567: Phone is 714-647-5933")
	void PhoneOfRecord567() {
		assertEquals("714-647-5933", customers.get(566).getPhone());
	}

	@Test
	@DisplayName("Record 567: Fax is 714-647-6722")
	void FaxOfRecord567() {
		assertEquals("714-647-6722", customers.get(566).getFax());
	}

	@Test
	@DisplayName("Record 567: Email is melisa@yoneoka.com")
	void EmailOfRecord567() {
		assertEquals("melisa@yoneoka.com", customers.get(566).getEmail());
	}

	@Test
	@DisplayName("Record 567: Web is http://www.melisayoneoka.com")
	void WebOfRecord567() {
		assertEquals("http://www.melisayoneoka.com", customers.get(566).getWeb());
	}
}
