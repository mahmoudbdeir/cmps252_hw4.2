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

@Tag("17")
class Record_3676 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3676: FirstName is Hilton")
	void FirstNameOfRecord3676() {
		assertEquals("Hilton", customers.get(3675).getFirstName());
	}

	@Test
	@DisplayName("Record 3676: LastName is Natwick")
	void LastNameOfRecord3676() {
		assertEquals("Natwick", customers.get(3675).getLastName());
	}

	@Test
	@DisplayName("Record 3676: Company is Kpm Corporation")
	void CompanyOfRecord3676() {
		assertEquals("Kpm Corporation", customers.get(3675).getCompany());
	}

	@Test
	@DisplayName("Record 3676: Address is 819 7th St Nw")
	void AddressOfRecord3676() {
		assertEquals("819 7th St Nw", customers.get(3675).getAddress());
	}

	@Test
	@DisplayName("Record 3676: City is Washington")
	void CityOfRecord3676() {
		assertEquals("Washington", customers.get(3675).getCity());
	}

	@Test
	@DisplayName("Record 3676: County is District of Columbia")
	void CountyOfRecord3676() {
		assertEquals("District of Columbia", customers.get(3675).getCounty());
	}

	@Test
	@DisplayName("Record 3676: State is DC")
	void StateOfRecord3676() {
		assertEquals("DC", customers.get(3675).getState());
	}

	@Test
	@DisplayName("Record 3676: ZIP is 20001")
	void ZIPOfRecord3676() {
		assertEquals("20001", customers.get(3675).getZIP());
	}

	@Test
	@DisplayName("Record 3676: Phone is 202-842-1601")
	void PhoneOfRecord3676() {
		assertEquals("202-842-1601", customers.get(3675).getPhone());
	}

	@Test
	@DisplayName("Record 3676: Fax is 202-842-8501")
	void FaxOfRecord3676() {
		assertEquals("202-842-8501", customers.get(3675).getFax());
	}

	@Test
	@DisplayName("Record 3676: Email is hilton@natwick.com")
	void EmailOfRecord3676() {
		assertEquals("hilton@natwick.com", customers.get(3675).getEmail());
	}

	@Test
	@DisplayName("Record 3676: Web is http://www.hiltonnatwick.com")
	void WebOfRecord3676() {
		assertEquals("http://www.hiltonnatwick.com", customers.get(3675).getWeb());
	}
}
