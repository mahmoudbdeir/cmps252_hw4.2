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
class Record_2340 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2340: FirstName is Jaime")
	void FirstNameOfRecord2340() {
		assertEquals("Jaime", customers.get(2339).getFirstName());
	}

	@Test
	@DisplayName("Record 2340: LastName is Frye")
	void LastNameOfRecord2340() {
		assertEquals("Frye", customers.get(2339).getLastName());
	}

	@Test
	@DisplayName("Record 2340: Company is Bergen Cmnty Regl Blood Ctr")
	void CompanyOfRecord2340() {
		assertEquals("Bergen Cmnty Regl Blood Ctr", customers.get(2339).getCompany());
	}

	@Test
	@DisplayName("Record 2340: Address is Box #-1089")
	void AddressOfRecord2340() {
		assertEquals("Box #-1089", customers.get(2339).getAddress());
	}

	@Test
	@DisplayName("Record 2340: City is Minnetonka")
	void CityOfRecord2340() {
		assertEquals("Minnetonka", customers.get(2339).getCity());
	}

	@Test
	@DisplayName("Record 2340: County is Hennepin")
	void CountyOfRecord2340() {
		assertEquals("Hennepin", customers.get(2339).getCounty());
	}

	@Test
	@DisplayName("Record 2340: State is MN")
	void StateOfRecord2340() {
		assertEquals("MN", customers.get(2339).getState());
	}

	@Test
	@DisplayName("Record 2340: ZIP is 55345")
	void ZIPOfRecord2340() {
		assertEquals("55345", customers.get(2339).getZIP());
	}

	@Test
	@DisplayName("Record 2340: Phone is 952-442-1594")
	void PhoneOfRecord2340() {
		assertEquals("952-442-1594", customers.get(2339).getPhone());
	}

	@Test
	@DisplayName("Record 2340: Fax is 952-442-1379")
	void FaxOfRecord2340() {
		assertEquals("952-442-1379", customers.get(2339).getFax());
	}

	@Test
	@DisplayName("Record 2340: Email is jaime@frye.com")
	void EmailOfRecord2340() {
		assertEquals("jaime@frye.com", customers.get(2339).getEmail());
	}

	@Test
	@DisplayName("Record 2340: Web is http://www.jaimefrye.com")
	void WebOfRecord2340() {
		assertEquals("http://www.jaimefrye.com", customers.get(2339).getWeb());
	}
}
