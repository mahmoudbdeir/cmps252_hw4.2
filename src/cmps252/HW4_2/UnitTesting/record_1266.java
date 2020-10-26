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

@Tag("6")
class Record_1266 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1266: FirstName is Ernest")
	void FirstNameOfRecord1266() {
		assertEquals("Ernest", customers.get(1265).getFirstName());
	}

	@Test
	@DisplayName("Record 1266: LastName is Mcyrath")
	void LastNameOfRecord1266() {
		assertEquals("Mcyrath", customers.get(1265).getLastName());
	}

	@Test
	@DisplayName("Record 1266: Company is Karmy, Regina E Md")
	void CompanyOfRecord1266() {
		assertEquals("Karmy, Regina E Md", customers.get(1265).getCompany());
	}

	@Test
	@DisplayName("Record 1266: Address is 132 N Yosemite Ave")
	void AddressOfRecord1266() {
		assertEquals("132 N Yosemite Ave", customers.get(1265).getAddress());
	}

	@Test
	@DisplayName("Record 1266: City is Oakdale")
	void CityOfRecord1266() {
		assertEquals("Oakdale", customers.get(1265).getCity());
	}

	@Test
	@DisplayName("Record 1266: County is Stanislaus")
	void CountyOfRecord1266() {
		assertEquals("Stanislaus", customers.get(1265).getCounty());
	}

	@Test
	@DisplayName("Record 1266: State is CA")
	void StateOfRecord1266() {
		assertEquals("CA", customers.get(1265).getState());
	}

	@Test
	@DisplayName("Record 1266: ZIP is 95361")
	void ZIPOfRecord1266() {
		assertEquals("95361", customers.get(1265).getZIP());
	}

	@Test
	@DisplayName("Record 1266: Phone is 209-847-7827")
	void PhoneOfRecord1266() {
		assertEquals("209-847-7827", customers.get(1265).getPhone());
	}

	@Test
	@DisplayName("Record 1266: Fax is 209-847-5113")
	void FaxOfRecord1266() {
		assertEquals("209-847-5113", customers.get(1265).getFax());
	}

	@Test
	@DisplayName("Record 1266: Email is ernest@mcyrath.com")
	void EmailOfRecord1266() {
		assertEquals("ernest@mcyrath.com", customers.get(1265).getEmail());
	}

	@Test
	@DisplayName("Record 1266: Web is http://www.ernestmcyrath.com")
	void WebOfRecord1266() {
		assertEquals("http://www.ernestmcyrath.com", customers.get(1265).getWeb());
	}
}
