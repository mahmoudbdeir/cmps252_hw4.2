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
class Record_4109 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4109: FirstName is Gail")
	void FirstNameOfRecord4109() {
		assertEquals("Gail", customers.get(4108).getFirstName());
	}

	@Test
	@DisplayName("Record 4109: LastName is Udoh")
	void LastNameOfRecord4109() {
		assertEquals("Udoh", customers.get(4108).getLastName());
	}

	@Test
	@DisplayName("Record 4109: Company is Untd States Medl Exprt Co Inc")
	void CompanyOfRecord4109() {
		assertEquals("Untd States Medl Exprt Co Inc", customers.get(4108).getCompany());
	}

	@Test
	@DisplayName("Record 4109: Address is 3200 N Delaware St")
	void AddressOfRecord4109() {
		assertEquals("3200 N Delaware St", customers.get(4108).getAddress());
	}

	@Test
	@DisplayName("Record 4109: City is Chandler")
	void CityOfRecord4109() {
		assertEquals("Chandler", customers.get(4108).getCity());
	}

	@Test
	@DisplayName("Record 4109: County is Maricopa")
	void CountyOfRecord4109() {
		assertEquals("Maricopa", customers.get(4108).getCounty());
	}

	@Test
	@DisplayName("Record 4109: State is AZ")
	void StateOfRecord4109() {
		assertEquals("AZ", customers.get(4108).getState());
	}

	@Test
	@DisplayName("Record 4109: ZIP is 85225")
	void ZIPOfRecord4109() {
		assertEquals("85225", customers.get(4108).getZIP());
	}

	@Test
	@DisplayName("Record 4109: Phone is 480-545-3582")
	void PhoneOfRecord4109() {
		assertEquals("480-545-3582", customers.get(4108).getPhone());
	}

	@Test
	@DisplayName("Record 4109: Fax is 480-545-5885")
	void FaxOfRecord4109() {
		assertEquals("480-545-5885", customers.get(4108).getFax());
	}

	@Test
	@DisplayName("Record 4109: Email is gail@udoh.com")
	void EmailOfRecord4109() {
		assertEquals("gail@udoh.com", customers.get(4108).getEmail());
	}

	@Test
	@DisplayName("Record 4109: Web is http://www.gailudoh.com")
	void WebOfRecord4109() {
		assertEquals("http://www.gailudoh.com", customers.get(4108).getWeb());
	}
}
