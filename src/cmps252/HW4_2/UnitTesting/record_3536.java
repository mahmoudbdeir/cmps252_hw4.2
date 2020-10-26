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

@Tag("1")
class Record_3536 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3536: FirstName is Whitney")
	void FirstNameOfRecord3536() {
		assertEquals("Whitney", customers.get(3535).getFirstName());
	}

	@Test
	@DisplayName("Record 3536: LastName is Stinehelfer")
	void LastNameOfRecord3536() {
		assertEquals("Stinehelfer", customers.get(3535).getLastName());
	}

	@Test
	@DisplayName("Record 3536: Company is Photo Packaging West")
	void CompanyOfRecord3536() {
		assertEquals("Photo Packaging West", customers.get(3535).getCompany());
	}

	@Test
	@DisplayName("Record 3536: Address is 1132 N Magnolia Ave")
	void AddressOfRecord3536() {
		assertEquals("1132 N Magnolia Ave", customers.get(3535).getAddress());
	}

	@Test
	@DisplayName("Record 3536: City is Anahym")
	void CityOfRecord3536() {
		assertEquals("Anahym", customers.get(3535).getCity());
	}

	@Test
	@DisplayName("Record 3536: County is Orange")
	void CountyOfRecord3536() {
		assertEquals("Orange", customers.get(3535).getCounty());
	}

	@Test
	@DisplayName("Record 3536: State is CA")
	void StateOfRecord3536() {
		assertEquals("CA", customers.get(3535).getState());
	}

	@Test
	@DisplayName("Record 3536: ZIP is 92801")
	void ZIPOfRecord3536() {
		assertEquals("92801", customers.get(3535).getZIP());
	}

	@Test
	@DisplayName("Record 3536: Phone is 714-827-9366")
	void PhoneOfRecord3536() {
		assertEquals("714-827-9366", customers.get(3535).getPhone());
	}

	@Test
	@DisplayName("Record 3536: Fax is 714-827-4897")
	void FaxOfRecord3536() {
		assertEquals("714-827-4897", customers.get(3535).getFax());
	}

	@Test
	@DisplayName("Record 3536: Email is whitney@stinehelfer.com")
	void EmailOfRecord3536() {
		assertEquals("whitney@stinehelfer.com", customers.get(3535).getEmail());
	}

	@Test
	@DisplayName("Record 3536: Web is http://www.whitneystinehelfer.com")
	void WebOfRecord3536() {
		assertEquals("http://www.whitneystinehelfer.com", customers.get(3535).getWeb());
	}
}
