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

@Tag("18")
class Record_1564 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1564: FirstName is Kelley")
	void FirstNameOfRecord1564() {
		assertEquals("Kelley", customers.get(1563).getFirstName());
	}

	@Test
	@DisplayName("Record 1564: LastName is Gesselli")
	void LastNameOfRecord1564() {
		assertEquals("Gesselli", customers.get(1563).getLastName());
	}

	@Test
	@DisplayName("Record 1564: Company is Lockley Manufacturing Co")
	void CompanyOfRecord1564() {
		assertEquals("Lockley Manufacturing Co", customers.get(1563).getCompany());
	}

	@Test
	@DisplayName("Record 1564: Address is 171 Camden Rd")
	void AddressOfRecord1564() {
		assertEquals("171 Camden Rd", customers.get(1563).getAddress());
	}

	@Test
	@DisplayName("Record 1564: City is Warren")
	void CityOfRecord1564() {
		assertEquals("Warren", customers.get(1563).getCity());
	}

	@Test
	@DisplayName("Record 1564: County is Knox")
	void CountyOfRecord1564() {
		assertEquals("Knox", customers.get(1563).getCounty());
	}

	@Test
	@DisplayName("Record 1564: State is ME")
	void StateOfRecord1564() {
		assertEquals("ME", customers.get(1563).getState());
	}

	@Test
	@DisplayName("Record 1564: ZIP is 4864")
	void ZIPOfRecord1564() {
		assertEquals("4864", customers.get(1563).getZIP());
	}

	@Test
	@DisplayName("Record 1564: Phone is 207-273-4241")
	void PhoneOfRecord1564() {
		assertEquals("207-273-4241", customers.get(1563).getPhone());
	}

	@Test
	@DisplayName("Record 1564: Fax is 207-273-5688")
	void FaxOfRecord1564() {
		assertEquals("207-273-5688", customers.get(1563).getFax());
	}

	@Test
	@DisplayName("Record 1564: Email is kelley@gesselli.com")
	void EmailOfRecord1564() {
		assertEquals("kelley@gesselli.com", customers.get(1563).getEmail());
	}

	@Test
	@DisplayName("Record 1564: Web is http://www.kelleygesselli.com")
	void WebOfRecord1564() {
		assertEquals("http://www.kelleygesselli.com", customers.get(1563).getWeb());
	}
}
