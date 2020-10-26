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
class Record_2326 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2326: FirstName is Rosetta")
	void FirstNameOfRecord2326() {
		assertEquals("Rosetta", customers.get(2325).getFirstName());
	}

	@Test
	@DisplayName("Record 2326: LastName is Bomgardner")
	void LastNameOfRecord2326() {
		assertEquals("Bomgardner", customers.get(2325).getLastName());
	}

	@Test
	@DisplayName("Record 2326: Company is Cornell University Medl Cllg")
	void CompanyOfRecord2326() {
		assertEquals("Cornell University Medl Cllg", customers.get(2325).getCompany());
	}

	@Test
	@DisplayName("Record 2326: Address is Paragon Dr")
	void AddressOfRecord2326() {
		assertEquals("Paragon Dr", customers.get(2325).getAddress());
	}

	@Test
	@DisplayName("Record 2326: City is Durham")
	void CityOfRecord2326() {
		assertEquals("Durham", customers.get(2325).getCity());
	}

	@Test
	@DisplayName("Record 2326: County is Durham")
	void CountyOfRecord2326() {
		assertEquals("Durham", customers.get(2325).getCounty());
	}

	@Test
	@DisplayName("Record 2326: State is NC")
	void StateOfRecord2326() {
		assertEquals("NC", customers.get(2325).getState());
	}

	@Test
	@DisplayName("Record 2326: ZIP is 27712")
	void ZIPOfRecord2326() {
		assertEquals("27712", customers.get(2325).getZIP());
	}

	@Test
	@DisplayName("Record 2326: Phone is 919-479-9532")
	void PhoneOfRecord2326() {
		assertEquals("919-479-9532", customers.get(2325).getPhone());
	}

	@Test
	@DisplayName("Record 2326: Fax is 919-479-4329")
	void FaxOfRecord2326() {
		assertEquals("919-479-4329", customers.get(2325).getFax());
	}

	@Test
	@DisplayName("Record 2326: Email is rosetta@bomgardner.com")
	void EmailOfRecord2326() {
		assertEquals("rosetta@bomgardner.com", customers.get(2325).getEmail());
	}

	@Test
	@DisplayName("Record 2326: Web is http://www.rosettabomgardner.com")
	void WebOfRecord2326() {
		assertEquals("http://www.rosettabomgardner.com", customers.get(2325).getWeb());
	}
}
