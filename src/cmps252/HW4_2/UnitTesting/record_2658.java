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

@Tag("17")
class Record_2658 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2658: FirstName is Darlene")
	void FirstNameOfRecord2658() {
		assertEquals("Darlene", customers.get(2657).getFirstName());
	}

	@Test
	@DisplayName("Record 2658: LastName is Fairhurst")
	void LastNameOfRecord2658() {
		assertEquals("Fairhurst", customers.get(2657).getLastName());
	}

	@Test
	@DisplayName("Record 2658: Company is Abc Appraisal Business Center")
	void CompanyOfRecord2658() {
		assertEquals("Abc Appraisal Business Center", customers.get(2657).getCompany());
	}

	@Test
	@DisplayName("Record 2658: Address is 221 Rohrerstown Rd")
	void AddressOfRecord2658() {
		assertEquals("221 Rohrerstown Rd", customers.get(2657).getAddress());
	}

	@Test
	@DisplayName("Record 2658: City is Lancaster")
	void CityOfRecord2658() {
		assertEquals("Lancaster", customers.get(2657).getCity());
	}

	@Test
	@DisplayName("Record 2658: County is Lancaster")
	void CountyOfRecord2658() {
		assertEquals("Lancaster", customers.get(2657).getCounty());
	}

	@Test
	@DisplayName("Record 2658: State is PA")
	void StateOfRecord2658() {
		assertEquals("PA", customers.get(2657).getState());
	}

	@Test
	@DisplayName("Record 2658: ZIP is 17603")
	void ZIPOfRecord2658() {
		assertEquals("17603", customers.get(2657).getZIP());
	}

	@Test
	@DisplayName("Record 2658: Phone is 717-394-4185")
	void PhoneOfRecord2658() {
		assertEquals("717-394-4185", customers.get(2657).getPhone());
	}

	@Test
	@DisplayName("Record 2658: Fax is 717-394-4691")
	void FaxOfRecord2658() {
		assertEquals("717-394-4691", customers.get(2657).getFax());
	}

	@Test
	@DisplayName("Record 2658: Email is darlene@fairhurst.com")
	void EmailOfRecord2658() {
		assertEquals("darlene@fairhurst.com", customers.get(2657).getEmail());
	}

	@Test
	@DisplayName("Record 2658: Web is http://www.darlenefairhurst.com")
	void WebOfRecord2658() {
		assertEquals("http://www.darlenefairhurst.com", customers.get(2657).getWeb());
	}
}
