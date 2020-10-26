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

@Tag("22")
class Record_1602 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1602: FirstName is Genaro")
	void FirstNameOfRecord1602() {
		assertEquals("Genaro", customers.get(1601).getFirstName());
	}

	@Test
	@DisplayName("Record 1602: LastName is Onishi")
	void LastNameOfRecord1602() {
		assertEquals("Onishi", customers.get(1601).getLastName());
	}

	@Test
	@DisplayName("Record 1602: Company is Central Bergen Federal Crdt Un")
	void CompanyOfRecord1602() {
		assertEquals("Central Bergen Federal Crdt Un", customers.get(1601).getCompany());
	}

	@Test
	@DisplayName("Record 1602: Address is 716 Jersey Ave")
	void AddressOfRecord1602() {
		assertEquals("716 Jersey Ave", customers.get(1601).getAddress());
	}

	@Test
	@DisplayName("Record 1602: City is Gloucester City")
	void CityOfRecord1602() {
		assertEquals("Gloucester City", customers.get(1601).getCity());
	}

	@Test
	@DisplayName("Record 1602: County is Camden")
	void CountyOfRecord1602() {
		assertEquals("Camden", customers.get(1601).getCounty());
	}

	@Test
	@DisplayName("Record 1602: State is NJ")
	void StateOfRecord1602() {
		assertEquals("NJ", customers.get(1601).getState());
	}

	@Test
	@DisplayName("Record 1602: ZIP is 8030")
	void ZIPOfRecord1602() {
		assertEquals("8030", customers.get(1601).getZIP());
	}

	@Test
	@DisplayName("Record 1602: Phone is 856-742-9340")
	void PhoneOfRecord1602() {
		assertEquals("856-742-9340", customers.get(1601).getPhone());
	}

	@Test
	@DisplayName("Record 1602: Fax is 856-742-8554")
	void FaxOfRecord1602() {
		assertEquals("856-742-8554", customers.get(1601).getFax());
	}

	@Test
	@DisplayName("Record 1602: Email is genaro@onishi.com")
	void EmailOfRecord1602() {
		assertEquals("genaro@onishi.com", customers.get(1601).getEmail());
	}

	@Test
	@DisplayName("Record 1602: Web is http://www.genaroonishi.com")
	void WebOfRecord1602() {
		assertEquals("http://www.genaroonishi.com", customers.get(1601).getWeb());
	}
}
