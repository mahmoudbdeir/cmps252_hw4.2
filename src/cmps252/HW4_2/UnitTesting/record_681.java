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
class Record_681 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 681: FirstName is Moses")
	void FirstNameOfRecord681() {
		assertEquals("Moses", customers.get(680).getFirstName());
	}

	@Test
	@DisplayName("Record 681: LastName is Rots")
	void LastNameOfRecord681() {
		assertEquals("Rots", customers.get(680).getLastName());
	}

	@Test
	@DisplayName("Record 681: Company is Levander, Harold Jr")
	void CompanyOfRecord681() {
		assertEquals("Levander, Harold Jr", customers.get(680).getCompany());
	}

	@Test
	@DisplayName("Record 681: Address is 1561 Easton Rd")
	void AddressOfRecord681() {
		assertEquals("1561 Easton Rd", customers.get(680).getAddress());
	}

	@Test
	@DisplayName("Record 681: City is Abington")
	void CityOfRecord681() {
		assertEquals("Abington", customers.get(680).getCity());
	}

	@Test
	@DisplayName("Record 681: County is Montgomery")
	void CountyOfRecord681() {
		assertEquals("Montgomery", customers.get(680).getCounty());
	}

	@Test
	@DisplayName("Record 681: State is PA")
	void StateOfRecord681() {
		assertEquals("PA", customers.get(680).getState());
	}

	@Test
	@DisplayName("Record 681: ZIP is 19001")
	void ZIPOfRecord681() {
		assertEquals("19001", customers.get(680).getZIP());
	}

	@Test
	@DisplayName("Record 681: Phone is 215-659-3777")
	void PhoneOfRecord681() {
		assertEquals("215-659-3777", customers.get(680).getPhone());
	}

	@Test
	@DisplayName("Record 681: Fax is 215-659-7702")
	void FaxOfRecord681() {
		assertEquals("215-659-7702", customers.get(680).getFax());
	}

	@Test
	@DisplayName("Record 681: Email is moses@rots.com")
	void EmailOfRecord681() {
		assertEquals("moses@rots.com", customers.get(680).getEmail());
	}

	@Test
	@DisplayName("Record 681: Web is http://www.mosesrots.com")
	void WebOfRecord681() {
		assertEquals("http://www.mosesrots.com", customers.get(680).getWeb());
	}
}
