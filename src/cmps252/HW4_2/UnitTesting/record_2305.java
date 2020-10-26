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

@Tag("2")
class Record_2305 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2305: FirstName is Rosalee")
	void FirstNameOfRecord2305() {
		assertEquals("Rosalee", customers.get(2304).getFirstName());
	}

	@Test
	@DisplayName("Record 2305: LastName is Pharmer")
	void LastNameOfRecord2305() {
		assertEquals("Pharmer", customers.get(2304).getLastName());
	}

	@Test
	@DisplayName("Record 2305: Company is Ksbw Tv 8 Nbc")
	void CompanyOfRecord2305() {
		assertEquals("Ksbw Tv 8 Nbc", customers.get(2304).getCompany());
	}

	@Test
	@DisplayName("Record 2305: Address is 1712 N Frazier St")
	void AddressOfRecord2305() {
		assertEquals("1712 N Frazier St", customers.get(2304).getAddress());
	}

	@Test
	@DisplayName("Record 2305: City is Conroe")
	void CityOfRecord2305() {
		assertEquals("Conroe", customers.get(2304).getCity());
	}

	@Test
	@DisplayName("Record 2305: County is Montgomery")
	void CountyOfRecord2305() {
		assertEquals("Montgomery", customers.get(2304).getCounty());
	}

	@Test
	@DisplayName("Record 2305: State is TX")
	void StateOfRecord2305() {
		assertEquals("TX", customers.get(2304).getState());
	}

	@Test
	@DisplayName("Record 2305: ZIP is 77301")
	void ZIPOfRecord2305() {
		assertEquals("77301", customers.get(2304).getZIP());
	}

	@Test
	@DisplayName("Record 2305: Phone is 936-760-4637")
	void PhoneOfRecord2305() {
		assertEquals("936-760-4637", customers.get(2304).getPhone());
	}

	@Test
	@DisplayName("Record 2305: Fax is 936-760-6173")
	void FaxOfRecord2305() {
		assertEquals("936-760-6173", customers.get(2304).getFax());
	}

	@Test
	@DisplayName("Record 2305: Email is rosalee@pharmer.com")
	void EmailOfRecord2305() {
		assertEquals("rosalee@pharmer.com", customers.get(2304).getEmail());
	}

	@Test
	@DisplayName("Record 2305: Web is http://www.rosaleepharmer.com")
	void WebOfRecord2305() {
		assertEquals("http://www.rosaleepharmer.com", customers.get(2304).getWeb());
	}
}
