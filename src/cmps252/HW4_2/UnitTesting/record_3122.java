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

@Tag("40")
class Record_3122 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3122: FirstName is Jenna")
	void FirstNameOfRecord3122() {
		assertEquals("Jenna", customers.get(3121).getFirstName());
	}

	@Test
	@DisplayName("Record 3122: LastName is Dolly")
	void LastNameOfRecord3122() {
		assertEquals("Dolly", customers.get(3121).getLastName());
	}

	@Test
	@DisplayName("Record 3122: Company is D C P Enterprises")
	void CompanyOfRecord3122() {
		assertEquals("D C P Enterprises", customers.get(3121).getCompany());
	}

	@Test
	@DisplayName("Record 3122: Address is 1093 Broxton Ave")
	void AddressOfRecord3122() {
		assertEquals("1093 Broxton Ave", customers.get(3121).getAddress());
	}

	@Test
	@DisplayName("Record 3122: City is Los Angeles")
	void CityOfRecord3122() {
		assertEquals("Los Angeles", customers.get(3121).getCity());
	}

	@Test
	@DisplayName("Record 3122: County is Los Angeles")
	void CountyOfRecord3122() {
		assertEquals("Los Angeles", customers.get(3121).getCounty());
	}

	@Test
	@DisplayName("Record 3122: State is CA")
	void StateOfRecord3122() {
		assertEquals("CA", customers.get(3121).getState());
	}

	@Test
	@DisplayName("Record 3122: ZIP is 90024")
	void ZIPOfRecord3122() {
		assertEquals("90024", customers.get(3121).getZIP());
	}

	@Test
	@DisplayName("Record 3122: Phone is 310-208-0173")
	void PhoneOfRecord3122() {
		assertEquals("310-208-0173", customers.get(3121).getPhone());
	}

	@Test
	@DisplayName("Record 3122: Fax is 310-208-8618")
	void FaxOfRecord3122() {
		assertEquals("310-208-8618", customers.get(3121).getFax());
	}

	@Test
	@DisplayName("Record 3122: Email is jenna@dolly.com")
	void EmailOfRecord3122() {
		assertEquals("jenna@dolly.com", customers.get(3121).getEmail());
	}

	@Test
	@DisplayName("Record 3122: Web is http://www.jennadolly.com")
	void WebOfRecord3122() {
		assertEquals("http://www.jennadolly.com", customers.get(3121).getWeb());
	}
}
