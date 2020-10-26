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

@Tag("5")
class Record_2162 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2162: FirstName is Felipe")
	void FirstNameOfRecord2162() {
		assertEquals("Felipe", customers.get(2161).getFirstName());
	}

	@Test
	@DisplayName("Record 2162: LastName is Lothian")
	void LastNameOfRecord2162() {
		assertEquals("Lothian", customers.get(2161).getLastName());
	}

	@Test
	@DisplayName("Record 2162: Company is Willenbrink, Rose")
	void CompanyOfRecord2162() {
		assertEquals("Willenbrink, Rose", customers.get(2161).getCompany());
	}

	@Test
	@DisplayName("Record 2162: Address is 334 Gunderman Rd")
	void AddressOfRecord2162() {
		assertEquals("334 Gunderman Rd", customers.get(2161).getAddress());
	}

	@Test
	@DisplayName("Record 2162: City is Lansing")
	void CityOfRecord2162() {
		assertEquals("Lansing", customers.get(2161).getCity());
	}

	@Test
	@DisplayName("Record 2162: County is Tompkins")
	void CountyOfRecord2162() {
		assertEquals("Tompkins", customers.get(2161).getCounty());
	}

	@Test
	@DisplayName("Record 2162: State is NY")
	void StateOfRecord2162() {
		assertEquals("NY", customers.get(2161).getState());
	}

	@Test
	@DisplayName("Record 2162: ZIP is 14882")
	void ZIPOfRecord2162() {
		assertEquals("14882", customers.get(2161).getZIP());
	}

	@Test
	@DisplayName("Record 2162: Phone is 607-275-2647")
	void PhoneOfRecord2162() {
		assertEquals("607-275-2647", customers.get(2161).getPhone());
	}

	@Test
	@DisplayName("Record 2162: Fax is 607-275-2992")
	void FaxOfRecord2162() {
		assertEquals("607-275-2992", customers.get(2161).getFax());
	}

	@Test
	@DisplayName("Record 2162: Email is felipe@lothian.com")
	void EmailOfRecord2162() {
		assertEquals("felipe@lothian.com", customers.get(2161).getEmail());
	}

	@Test
	@DisplayName("Record 2162: Web is http://www.felipelothian.com")
	void WebOfRecord2162() {
		assertEquals("http://www.felipelothian.com", customers.get(2161).getWeb());
	}
}
