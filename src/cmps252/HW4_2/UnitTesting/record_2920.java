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

@Tag("3")
class Record_2920 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2920: FirstName is Freddie")
	void FirstNameOfRecord2920() {
		assertEquals("Freddie", customers.get(2919).getFirstName());
	}

	@Test
	@DisplayName("Record 2920: LastName is Bulluck")
	void LastNameOfRecord2920() {
		assertEquals("Bulluck", customers.get(2919).getLastName());
	}

	@Test
	@DisplayName("Record 2920: Company is C & A Printing")
	void CompanyOfRecord2920() {
		assertEquals("C & A Printing", customers.get(2919).getCompany());
	}

	@Test
	@DisplayName("Record 2920: Address is 301 S Robertson Blvd")
	void AddressOfRecord2920() {
		assertEquals("301 S Robertson Blvd", customers.get(2919).getAddress());
	}

	@Test
	@DisplayName("Record 2920: City is Los Angeles")
	void CityOfRecord2920() {
		assertEquals("Los Angeles", customers.get(2919).getCity());
	}

	@Test
	@DisplayName("Record 2920: County is Los Angeles")
	void CountyOfRecord2920() {
		assertEquals("Los Angeles", customers.get(2919).getCounty());
	}

	@Test
	@DisplayName("Record 2920: State is CA")
	void StateOfRecord2920() {
		assertEquals("CA", customers.get(2919).getState());
	}

	@Test
	@DisplayName("Record 2920: ZIP is 90048")
	void ZIPOfRecord2920() {
		assertEquals("90048", customers.get(2919).getZIP());
	}

	@Test
	@DisplayName("Record 2920: Phone is 323-657-8781")
	void PhoneOfRecord2920() {
		assertEquals("323-657-8781", customers.get(2919).getPhone());
	}

	@Test
	@DisplayName("Record 2920: Fax is 323-657-4669")
	void FaxOfRecord2920() {
		assertEquals("323-657-4669", customers.get(2919).getFax());
	}

	@Test
	@DisplayName("Record 2920: Email is freddie@bulluck.com")
	void EmailOfRecord2920() {
		assertEquals("freddie@bulluck.com", customers.get(2919).getEmail());
	}

	@Test
	@DisplayName("Record 2920: Web is http://www.freddiebulluck.com")
	void WebOfRecord2920() {
		assertEquals("http://www.freddiebulluck.com", customers.get(2919).getWeb());
	}
}
