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

@Tag("20")
class Record_2229 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2229: FirstName is Jaime")
	void FirstNameOfRecord2229() {
		assertEquals("Jaime", customers.get(2228).getFirstName());
	}

	@Test
	@DisplayName("Record 2229: LastName is Pinnick")
	void LastNameOfRecord2229() {
		assertEquals("Pinnick", customers.get(2228).getLastName());
	}

	@Test
	@DisplayName("Record 2229: Company is M R S Appraisals L C")
	void CompanyOfRecord2229() {
		assertEquals("M R S Appraisals L C", customers.get(2228).getCompany());
	}

	@Test
	@DisplayName("Record 2229: Address is 619 Cliff St")
	void AddressOfRecord2229() {
		assertEquals("619 Cliff St", customers.get(2228).getAddress());
	}

	@Test
	@DisplayName("Record 2229: City is Battle Creek")
	void CityOfRecord2229() {
		assertEquals("Battle Creek", customers.get(2228).getCity());
	}

	@Test
	@DisplayName("Record 2229: County is Calhoun")
	void CountyOfRecord2229() {
		assertEquals("Calhoun", customers.get(2228).getCounty());
	}

	@Test
	@DisplayName("Record 2229: State is MI")
	void StateOfRecord2229() {
		assertEquals("MI", customers.get(2228).getState());
	}

	@Test
	@DisplayName("Record 2229: ZIP is 49017")
	void ZIPOfRecord2229() {
		assertEquals("49017", customers.get(2228).getZIP());
	}

	@Test
	@DisplayName("Record 2229: Phone is 269-962-9336")
	void PhoneOfRecord2229() {
		assertEquals("269-962-9336", customers.get(2228).getPhone());
	}

	@Test
	@DisplayName("Record 2229: Fax is 269-962-7238")
	void FaxOfRecord2229() {
		assertEquals("269-962-7238", customers.get(2228).getFax());
	}

	@Test
	@DisplayName("Record 2229: Email is jaime@pinnick.com")
	void EmailOfRecord2229() {
		assertEquals("jaime@pinnick.com", customers.get(2228).getEmail());
	}

	@Test
	@DisplayName("Record 2229: Web is http://www.jaimepinnick.com")
	void WebOfRecord2229() {
		assertEquals("http://www.jaimepinnick.com", customers.get(2228).getWeb());
	}
}
