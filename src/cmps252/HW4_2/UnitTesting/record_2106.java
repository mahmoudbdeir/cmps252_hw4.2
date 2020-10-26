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

@Tag("9")
class Record_2106 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2106: FirstName is Dianna")
	void FirstNameOfRecord2106() {
		assertEquals("Dianna", customers.get(2105).getFirstName());
	}

	@Test
	@DisplayName("Record 2106: LastName is Mustin")
	void LastNameOfRecord2106() {
		assertEquals("Mustin", customers.get(2105).getLastName());
	}

	@Test
	@DisplayName("Record 2106: Company is Philip T Emmons")
	void CompanyOfRecord2106() {
		assertEquals("Philip T Emmons", customers.get(2105).getCompany());
	}

	@Test
	@DisplayName("Record 2106: Address is 6321 Washington St  #-n")
	void AddressOfRecord2106() {
		assertEquals("6321 Washington St  #-n", customers.get(2105).getAddress());
	}

	@Test
	@DisplayName("Record 2106: City is Denver")
	void CityOfRecord2106() {
		assertEquals("Denver", customers.get(2105).getCity());
	}

	@Test
	@DisplayName("Record 2106: County is Denver")
	void CountyOfRecord2106() {
		assertEquals("Denver", customers.get(2105).getCounty());
	}

	@Test
	@DisplayName("Record 2106: State is CO")
	void StateOfRecord2106() {
		assertEquals("CO", customers.get(2105).getState());
	}

	@Test
	@DisplayName("Record 2106: ZIP is 80216")
	void ZIPOfRecord2106() {
		assertEquals("80216", customers.get(2105).getZIP());
	}

	@Test
	@DisplayName("Record 2106: Phone is 303-289-1086")
	void PhoneOfRecord2106() {
		assertEquals("303-289-1086", customers.get(2105).getPhone());
	}

	@Test
	@DisplayName("Record 2106: Fax is 303-289-1819")
	void FaxOfRecord2106() {
		assertEquals("303-289-1819", customers.get(2105).getFax());
	}

	@Test
	@DisplayName("Record 2106: Email is dianna@mustin.com")
	void EmailOfRecord2106() {
		assertEquals("dianna@mustin.com", customers.get(2105).getEmail());
	}

	@Test
	@DisplayName("Record 2106: Web is http://www.diannamustin.com")
	void WebOfRecord2106() {
		assertEquals("http://www.diannamustin.com", customers.get(2105).getWeb());
	}
}
