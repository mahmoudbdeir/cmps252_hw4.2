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

@Tag("38")
class Record_2081 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2081: FirstName is Maurine")
	void FirstNameOfRecord2081() {
		assertEquals("Maurine", customers.get(2080).getFirstName());
	}

	@Test
	@DisplayName("Record 2081: LastName is Bogg")
	void LastNameOfRecord2081() {
		assertEquals("Bogg", customers.get(2080).getLastName());
	}

	@Test
	@DisplayName("Record 2081: Company is French Enterprises Inc")
	void CompanyOfRecord2081() {
		assertEquals("French Enterprises Inc", customers.get(2080).getCompany());
	}

	@Test
	@DisplayName("Record 2081: Address is 2700 Vernon Dr")
	void AddressOfRecord2081() {
		assertEquals("2700 Vernon Dr", customers.get(2080).getAddress());
	}

	@Test
	@DisplayName("Record 2081: City is Green Bay")
	void CityOfRecord2081() {
		assertEquals("Green Bay", customers.get(2080).getCity());
	}

	@Test
	@DisplayName("Record 2081: County is Brown")
	void CountyOfRecord2081() {
		assertEquals("Brown", customers.get(2080).getCounty());
	}

	@Test
	@DisplayName("Record 2081: State is WI")
	void StateOfRecord2081() {
		assertEquals("WI", customers.get(2080).getState());
	}

	@Test
	@DisplayName("Record 2081: ZIP is 54304")
	void ZIPOfRecord2081() {
		assertEquals("54304", customers.get(2080).getZIP());
	}

	@Test
	@DisplayName("Record 2081: Phone is 920-494-3500")
	void PhoneOfRecord2081() {
		assertEquals("920-494-3500", customers.get(2080).getPhone());
	}

	@Test
	@DisplayName("Record 2081: Fax is 920-494-7344")
	void FaxOfRecord2081() {
		assertEquals("920-494-7344", customers.get(2080).getFax());
	}

	@Test
	@DisplayName("Record 2081: Email is maurine@bogg.com")
	void EmailOfRecord2081() {
		assertEquals("maurine@bogg.com", customers.get(2080).getEmail());
	}

	@Test
	@DisplayName("Record 2081: Web is http://www.maurinebogg.com")
	void WebOfRecord2081() {
		assertEquals("http://www.maurinebogg.com", customers.get(2080).getWeb());
	}
}
