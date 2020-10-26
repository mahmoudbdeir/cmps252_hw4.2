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

@Tag("48")
class Record_2627 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2627: FirstName is Elva")
	void FirstNameOfRecord2627() {
		assertEquals("Elva", customers.get(2626).getFirstName());
	}

	@Test
	@DisplayName("Record 2627: LastName is Uffelman")
	void LastNameOfRecord2627() {
		assertEquals("Uffelman", customers.get(2626).getLastName());
	}

	@Test
	@DisplayName("Record 2627: Company is Cary, Ross J Jr")
	void CompanyOfRecord2627() {
		assertEquals("Cary, Ross J Jr", customers.get(2626).getCompany());
	}

	@Test
	@DisplayName("Record 2627: Address is 815 M St")
	void AddressOfRecord2627() {
		assertEquals("815 M St", customers.get(2626).getAddress());
	}

	@Test
	@DisplayName("Record 2627: City is Lincoln")
	void CityOfRecord2627() {
		assertEquals("Lincoln", customers.get(2626).getCity());
	}

	@Test
	@DisplayName("Record 2627: County is Lancaster")
	void CountyOfRecord2627() {
		assertEquals("Lancaster", customers.get(2626).getCounty());
	}

	@Test
	@DisplayName("Record 2627: State is NE")
	void StateOfRecord2627() {
		assertEquals("NE", customers.get(2626).getState());
	}

	@Test
	@DisplayName("Record 2627: ZIP is 68508")
	void ZIPOfRecord2627() {
		assertEquals("68508", customers.get(2626).getZIP());
	}

	@Test
	@DisplayName("Record 2627: Phone is 402-477-7538")
	void PhoneOfRecord2627() {
		assertEquals("402-477-7538", customers.get(2626).getPhone());
	}

	@Test
	@DisplayName("Record 2627: Fax is 402-477-4283")
	void FaxOfRecord2627() {
		assertEquals("402-477-4283", customers.get(2626).getFax());
	}

	@Test
	@DisplayName("Record 2627: Email is elva@uffelman.com")
	void EmailOfRecord2627() {
		assertEquals("elva@uffelman.com", customers.get(2626).getEmail());
	}

	@Test
	@DisplayName("Record 2627: Web is http://www.elvauffelman.com")
	void WebOfRecord2627() {
		assertEquals("http://www.elvauffelman.com", customers.get(2626).getWeb());
	}
}
