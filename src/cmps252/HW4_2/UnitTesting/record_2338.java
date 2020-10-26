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

@Tag("30")
class Record_2338 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2338: FirstName is Belinda")
	void FirstNameOfRecord2338() {
		assertEquals("Belinda", customers.get(2337).getFirstName());
	}

	@Test
	@DisplayName("Record 2338: LastName is Monarch")
	void LastNameOfRecord2338() {
		assertEquals("Monarch", customers.get(2337).getLastName());
	}

	@Test
	@DisplayName("Record 2338: Company is Harris Enterprises Inc")
	void CompanyOfRecord2338() {
		assertEquals("Harris Enterprises Inc", customers.get(2337).getCompany());
	}

	@Test
	@DisplayName("Record 2338: Address is E Bank")
	void AddressOfRecord2338() {
		assertEquals("E Bank", customers.get(2337).getAddress());
	}

	@Test
	@DisplayName("Record 2338: City is Gramercy")
	void CityOfRecord2338() {
		assertEquals("Gramercy", customers.get(2337).getCity());
	}

	@Test
	@DisplayName("Record 2338: County is Saint James")
	void CountyOfRecord2338() {
		assertEquals("Saint James", customers.get(2337).getCounty());
	}

	@Test
	@DisplayName("Record 2338: State is LA")
	void StateOfRecord2338() {
		assertEquals("LA", customers.get(2337).getState());
	}

	@Test
	@DisplayName("Record 2338: ZIP is 70052")
	void ZIPOfRecord2338() {
		assertEquals("70052", customers.get(2337).getZIP());
	}

	@Test
	@DisplayName("Record 2338: Phone is 225-362-3275")
	void PhoneOfRecord2338() {
		assertEquals("225-362-3275", customers.get(2337).getPhone());
	}

	@Test
	@DisplayName("Record 2338: Fax is 225-362-5892")
	void FaxOfRecord2338() {
		assertEquals("225-362-5892", customers.get(2337).getFax());
	}

	@Test
	@DisplayName("Record 2338: Email is belinda@monarch.com")
	void EmailOfRecord2338() {
		assertEquals("belinda@monarch.com", customers.get(2337).getEmail());
	}

	@Test
	@DisplayName("Record 2338: Web is http://www.belindamonarch.com")
	void WebOfRecord2338() {
		assertEquals("http://www.belindamonarch.com", customers.get(2337).getWeb());
	}
}
