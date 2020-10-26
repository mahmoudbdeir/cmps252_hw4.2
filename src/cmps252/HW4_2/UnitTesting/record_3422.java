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
class Record_3422 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3422: FirstName is Shyla")
	void FirstNameOfRecord3422() {
		assertEquals("Shyla", customers.get(3421).getFirstName());
	}

	@Test
	@DisplayName("Record 3422: LastName is Wardian")
	void LastNameOfRecord3422() {
		assertEquals("Wardian", customers.get(3421).getLastName());
	}

	@Test
	@DisplayName("Record 3422: Company is Charter Club At Princeton Univ")
	void CompanyOfRecord3422() {
		assertEquals("Charter Club At Princeton Univ", customers.get(3421).getCompany());
	}

	@Test
	@DisplayName("Record 3422: Address is 63 Euclid Ave")
	void AddressOfRecord3422() {
		assertEquals("63 Euclid Ave", customers.get(3421).getAddress());
	}

	@Test
	@DisplayName("Record 3422: City is Newark")
	void CityOfRecord3422() {
		assertEquals("Newark", customers.get(3421).getCity());
	}

	@Test
	@DisplayName("Record 3422: County is Essex")
	void CountyOfRecord3422() {
		assertEquals("Essex", customers.get(3421).getCounty());
	}

	@Test
	@DisplayName("Record 3422: State is NJ")
	void StateOfRecord3422() {
		assertEquals("NJ", customers.get(3421).getState());
	}

	@Test
	@DisplayName("Record 3422: ZIP is 7105")
	void ZIPOfRecord3422() {
		assertEquals("07105", customers.get(3421).getZIP());
	}

	@Test
	@DisplayName("Record 3422: Phone is 973-344-6463")
	void PhoneOfRecord3422() {
		assertEquals("973-344-6463", customers.get(3421).getPhone());
	}

	@Test
	@DisplayName("Record 3422: Fax is 973-344-8604")
	void FaxOfRecord3422() {
		assertEquals("973-344-8604", customers.get(3421).getFax());
	}

	@Test
	@DisplayName("Record 3422: Email is shyla@wardian.com")
	void EmailOfRecord3422() {
		assertEquals("shyla@wardian.com", customers.get(3421).getEmail());
	}

	@Test
	@DisplayName("Record 3422: Web is http://www.shylawardian.com")
	void WebOfRecord3422() {
		assertEquals("http://www.shylawardian.com", customers.get(3421).getWeb());
	}
}
