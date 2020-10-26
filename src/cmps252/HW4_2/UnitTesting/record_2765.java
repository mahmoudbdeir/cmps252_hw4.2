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
class Record_2765 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2765: FirstName is Boyce")
	void FirstNameOfRecord2765() {
		assertEquals("Boyce", customers.get(2764).getFirstName());
	}

	@Test
	@DisplayName("Record 2765: LastName is Byrum")
	void LastNameOfRecord2765() {
		assertEquals("Byrum", customers.get(2764).getLastName());
	}

	@Test
	@DisplayName("Record 2765: Company is Walbro Corporation")
	void CompanyOfRecord2765() {
		assertEquals("Walbro Corporation", customers.get(2764).getCompany());
	}

	@Test
	@DisplayName("Record 2765: Address is Federal Blvd")
	void AddressOfRecord2765() {
		assertEquals("Federal Blvd", customers.get(2764).getAddress());
	}

	@Test
	@DisplayName("Record 2765: City is Denver")
	void CityOfRecord2765() {
		assertEquals("Denver", customers.get(2764).getCity());
	}

	@Test
	@DisplayName("Record 2765: County is Denver")
	void CountyOfRecord2765() {
		assertEquals("Denver", customers.get(2764).getCounty());
	}

	@Test
	@DisplayName("Record 2765: State is CO")
	void StateOfRecord2765() {
		assertEquals("CO", customers.get(2764).getState());
	}

	@Test
	@DisplayName("Record 2765: ZIP is 80219")
	void ZIPOfRecord2765() {
		assertEquals("80219", customers.get(2764).getZIP());
	}

	@Test
	@DisplayName("Record 2765: Phone is 303-935-8810")
	void PhoneOfRecord2765() {
		assertEquals("303-935-8810", customers.get(2764).getPhone());
	}

	@Test
	@DisplayName("Record 2765: Fax is 303-935-5256")
	void FaxOfRecord2765() {
		assertEquals("303-935-5256", customers.get(2764).getFax());
	}

	@Test
	@DisplayName("Record 2765: Email is boyce@byrum.com")
	void EmailOfRecord2765() {
		assertEquals("boyce@byrum.com", customers.get(2764).getEmail());
	}

	@Test
	@DisplayName("Record 2765: Web is http://www.boycebyrum.com")
	void WebOfRecord2765() {
		assertEquals("http://www.boycebyrum.com", customers.get(2764).getWeb());
	}
}
