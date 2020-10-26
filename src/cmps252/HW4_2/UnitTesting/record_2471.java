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

@Tag("4")
class Record_2471 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2471: FirstName is Ruben")
	void FirstNameOfRecord2471() {
		assertEquals("Ruben", customers.get(2470).getFirstName());
	}

	@Test
	@DisplayName("Record 2471: LastName is Mercando")
	void LastNameOfRecord2471() {
		assertEquals("Mercando", customers.get(2470).getLastName());
	}

	@Test
	@DisplayName("Record 2471: Company is Us Flag & Specialty Supply")
	void CompanyOfRecord2471() {
		assertEquals("Us Flag & Specialty Supply", customers.get(2470).getCompany());
	}

	@Test
	@DisplayName("Record 2471: Address is 61 Industrial Blvd")
	void AddressOfRecord2471() {
		assertEquals("61 Industrial Blvd", customers.get(2470).getAddress());
	}

	@Test
	@DisplayName("Record 2471: City is Plattsburgh")
	void CityOfRecord2471() {
		assertEquals("Plattsburgh", customers.get(2470).getCity());
	}

	@Test
	@DisplayName("Record 2471: County is Clinton")
	void CountyOfRecord2471() {
		assertEquals("Clinton", customers.get(2470).getCounty());
	}

	@Test
	@DisplayName("Record 2471: State is NY")
	void StateOfRecord2471() {
		assertEquals("NY", customers.get(2470).getState());
	}

	@Test
	@DisplayName("Record 2471: ZIP is 12901")
	void ZIPOfRecord2471() {
		assertEquals("12901", customers.get(2470).getZIP());
	}

	@Test
	@DisplayName("Record 2471: Phone is 518-563-8550")
	void PhoneOfRecord2471() {
		assertEquals("518-563-8550", customers.get(2470).getPhone());
	}

	@Test
	@DisplayName("Record 2471: Fax is 518-563-4517")
	void FaxOfRecord2471() {
		assertEquals("518-563-4517", customers.get(2470).getFax());
	}

	@Test
	@DisplayName("Record 2471: Email is ruben@mercando.com")
	void EmailOfRecord2471() {
		assertEquals("ruben@mercando.com", customers.get(2470).getEmail());
	}

	@Test
	@DisplayName("Record 2471: Web is http://www.rubenmercando.com")
	void WebOfRecord2471() {
		assertEquals("http://www.rubenmercando.com", customers.get(2470).getWeb());
	}
}
