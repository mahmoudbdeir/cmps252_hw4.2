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

@Tag("29")
class Record_2786 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2786: FirstName is Ted")
	void FirstNameOfRecord2786() {
		assertEquals("Ted", customers.get(2785).getFirstName());
	}

	@Test
	@DisplayName("Record 2786: LastName is Fok")
	void LastNameOfRecord2786() {
		assertEquals("Fok", customers.get(2785).getLastName());
	}

	@Test
	@DisplayName("Record 2786: Company is Ming Tree Willow Crk Real Est")
	void CompanyOfRecord2786() {
		assertEquals("Ming Tree Willow Crk Real Est", customers.get(2785).getCompany());
	}

	@Test
	@DisplayName("Record 2786: Address is 6910 N Main St")
	void AddressOfRecord2786() {
		assertEquals("6910 N Main St", customers.get(2785).getAddress());
	}

	@Test
	@DisplayName("Record 2786: City is Granger")
	void CityOfRecord2786() {
		assertEquals("Granger", customers.get(2785).getCity());
	}

	@Test
	@DisplayName("Record 2786: County is St Joseph")
	void CountyOfRecord2786() {
		assertEquals("St Joseph", customers.get(2785).getCounty());
	}

	@Test
	@DisplayName("Record 2786: State is IN")
	void StateOfRecord2786() {
		assertEquals("IN", customers.get(2785).getState());
	}

	@Test
	@DisplayName("Record 2786: ZIP is 46530")
	void ZIPOfRecord2786() {
		assertEquals("46530", customers.get(2785).getZIP());
	}

	@Test
	@DisplayName("Record 2786: Phone is 574-272-5114")
	void PhoneOfRecord2786() {
		assertEquals("574-272-5114", customers.get(2785).getPhone());
	}

	@Test
	@DisplayName("Record 2786: Fax is 574-272-9945")
	void FaxOfRecord2786() {
		assertEquals("574-272-9945", customers.get(2785).getFax());
	}

	@Test
	@DisplayName("Record 2786: Email is ted@fok.com")
	void EmailOfRecord2786() {
		assertEquals("ted@fok.com", customers.get(2785).getEmail());
	}

	@Test
	@DisplayName("Record 2786: Web is http://www.tedfok.com")
	void WebOfRecord2786() {
		assertEquals("http://www.tedfok.com", customers.get(2785).getWeb());
	}
}
