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

@Tag("1")
class Record_4079 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4079: FirstName is Hobert")
	void FirstNameOfRecord4079() {
		assertEquals("Hobert", customers.get(4078).getFirstName());
	}

	@Test
	@DisplayName("Record 4079: LastName is Ralston")
	void LastNameOfRecord4079() {
		assertEquals("Ralston", customers.get(4078).getLastName());
	}

	@Test
	@DisplayName("Record 4079: Company is Amesbury News Merrimac Vly")
	void CompanyOfRecord4079() {
		assertEquals("Amesbury News Merrimac Vly", customers.get(4078).getCompany());
	}

	@Test
	@DisplayName("Record 4079: Address is 64 United Dr")
	void AddressOfRecord4079() {
		assertEquals("64 United Dr", customers.get(4078).getAddress());
	}

	@Test
	@DisplayName("Record 4079: City is Jackson")
	void CityOfRecord4079() {
		assertEquals("Jackson", customers.get(4078).getCity());
	}

	@Test
	@DisplayName("Record 4079: County is Madison")
	void CountyOfRecord4079() {
		assertEquals("Madison", customers.get(4078).getCounty());
	}

	@Test
	@DisplayName("Record 4079: State is TN")
	void StateOfRecord4079() {
		assertEquals("TN", customers.get(4078).getState());
	}

	@Test
	@DisplayName("Record 4079: ZIP is 38305")
	void ZIPOfRecord4079() {
		assertEquals("38305", customers.get(4078).getZIP());
	}

	@Test
	@DisplayName("Record 4079: Phone is 731-664-2021")
	void PhoneOfRecord4079() {
		assertEquals("731-664-2021", customers.get(4078).getPhone());
	}

	@Test
	@DisplayName("Record 4079: Fax is 731-664-8014")
	void FaxOfRecord4079() {
		assertEquals("731-664-8014", customers.get(4078).getFax());
	}

	@Test
	@DisplayName("Record 4079: Email is hobert@ralston.com")
	void EmailOfRecord4079() {
		assertEquals("hobert@ralston.com", customers.get(4078).getEmail());
	}

	@Test
	@DisplayName("Record 4079: Web is http://www.hobertralston.com")
	void WebOfRecord4079() {
		assertEquals("http://www.hobertralston.com", customers.get(4078).getWeb());
	}
}
