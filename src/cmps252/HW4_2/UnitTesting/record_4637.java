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

@Tag("48")
class Record_4637 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4637: FirstName is Helga")
	void FirstNameOfRecord4637() {
		assertEquals("Helga", customers.get(4636).getFirstName());
	}

	@Test
	@DisplayName("Record 4637: LastName is Beardsley")
	void LastNameOfRecord4637() {
		assertEquals("Beardsley", customers.get(4636).getLastName());
	}

	@Test
	@DisplayName("Record 4637: Company is Coronado Mfg")
	void CompanyOfRecord4637() {
		assertEquals("Coronado Mfg", customers.get(4636).getCompany());
	}

	@Test
	@DisplayName("Record 4637: Address is 809 E Gloria Switch Rd")
	void AddressOfRecord4637() {
		assertEquals("809 E Gloria Switch Rd", customers.get(4636).getAddress());
	}

	@Test
	@DisplayName("Record 4637: City is Lafayette")
	void CityOfRecord4637() {
		assertEquals("Lafayette", customers.get(4636).getCity());
	}

	@Test
	@DisplayName("Record 4637: County is Lafayette")
	void CountyOfRecord4637() {
		assertEquals("Lafayette", customers.get(4636).getCounty());
	}

	@Test
	@DisplayName("Record 4637: State is LA")
	void StateOfRecord4637() {
		assertEquals("LA", customers.get(4636).getState());
	}

	@Test
	@DisplayName("Record 4637: ZIP is 70507")
	void ZIPOfRecord4637() {
		assertEquals("70507", customers.get(4636).getZIP());
	}

	@Test
	@DisplayName("Record 4637: Phone is 337-235-7113")
	void PhoneOfRecord4637() {
		assertEquals("337-235-7113", customers.get(4636).getPhone());
	}

	@Test
	@DisplayName("Record 4637: Fax is 337-235-0807")
	void FaxOfRecord4637() {
		assertEquals("337-235-0807", customers.get(4636).getFax());
	}

	@Test
	@DisplayName("Record 4637: Email is helga@beardsley.com")
	void EmailOfRecord4637() {
		assertEquals("helga@beardsley.com", customers.get(4636).getEmail());
	}

	@Test
	@DisplayName("Record 4637: Web is http://www.helgabeardsley.com")
	void WebOfRecord4637() {
		assertEquals("http://www.helgabeardsley.com", customers.get(4636).getWeb());
	}
}
