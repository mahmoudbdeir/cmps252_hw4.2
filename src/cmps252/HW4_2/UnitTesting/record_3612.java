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

@Tag("18")
class Record_3612 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3612: FirstName is Beverley")
	void FirstNameOfRecord3612() {
		assertEquals("Beverley", customers.get(3611).getFirstName());
	}

	@Test
	@DisplayName("Record 3612: LastName is Tredo")
	void LastNameOfRecord3612() {
		assertEquals("Tredo", customers.get(3611).getLastName());
	}

	@Test
	@DisplayName("Record 3612: Company is Pip Printing")
	void CompanyOfRecord3612() {
		assertEquals("Pip Printing", customers.get(3611).getCompany());
	}

	@Test
	@DisplayName("Record 3612: Address is 2453 Grand Canal Blvd  #-2")
	void AddressOfRecord3612() {
		assertEquals("2453 Grand Canal Blvd  #-2", customers.get(3611).getAddress());
	}

	@Test
	@DisplayName("Record 3612: City is Stockton")
	void CityOfRecord3612() {
		assertEquals("Stockton", customers.get(3611).getCity());
	}

	@Test
	@DisplayName("Record 3612: County is San Joaquin")
	void CountyOfRecord3612() {
		assertEquals("San Joaquin", customers.get(3611).getCounty());
	}

	@Test
	@DisplayName("Record 3612: State is CA")
	void StateOfRecord3612() {
		assertEquals("CA", customers.get(3611).getState());
	}

	@Test
	@DisplayName("Record 3612: ZIP is 95207")
	void ZIPOfRecord3612() {
		assertEquals("95207", customers.get(3611).getZIP());
	}

	@Test
	@DisplayName("Record 3612: Phone is 209-473-3337")
	void PhoneOfRecord3612() {
		assertEquals("209-473-3337", customers.get(3611).getPhone());
	}

	@Test
	@DisplayName("Record 3612: Fax is 209-473-9911")
	void FaxOfRecord3612() {
		assertEquals("209-473-9911", customers.get(3611).getFax());
	}

	@Test
	@DisplayName("Record 3612: Email is beverley@tredo.com")
	void EmailOfRecord3612() {
		assertEquals("beverley@tredo.com", customers.get(3611).getEmail());
	}

	@Test
	@DisplayName("Record 3612: Web is http://www.beverleytredo.com")
	void WebOfRecord3612() {
		assertEquals("http://www.beverleytredo.com", customers.get(3611).getWeb());
	}
}
