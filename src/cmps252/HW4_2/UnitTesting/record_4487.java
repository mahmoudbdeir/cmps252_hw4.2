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
class Record_4487 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4487: FirstName is Nichole")
	void FirstNameOfRecord4487() {
		assertEquals("Nichole", customers.get(4486).getFirstName());
	}

	@Test
	@DisplayName("Record 4487: LastName is Severi")
	void LastNameOfRecord4487() {
		assertEquals("Severi", customers.get(4486).getLastName());
	}

	@Test
	@DisplayName("Record 4487: Company is L R Myster & Assoc Inc")
	void CompanyOfRecord4487() {
		assertEquals("L R Myster & Assoc Inc", customers.get(4486).getCompany());
	}

	@Test
	@DisplayName("Record 4487: Address is 8845 General Dr")
	void AddressOfRecord4487() {
		assertEquals("8845 General Dr", customers.get(4486).getAddress());
	}

	@Test
	@DisplayName("Record 4487: City is Plymouth")
	void CityOfRecord4487() {
		assertEquals("Plymouth", customers.get(4486).getCity());
	}

	@Test
	@DisplayName("Record 4487: County is Wayne")
	void CountyOfRecord4487() {
		assertEquals("Wayne", customers.get(4486).getCounty());
	}

	@Test
	@DisplayName("Record 4487: State is MI")
	void StateOfRecord4487() {
		assertEquals("MI", customers.get(4486).getState());
	}

	@Test
	@DisplayName("Record 4487: ZIP is 48170")
	void ZIPOfRecord4487() {
		assertEquals("48170", customers.get(4486).getZIP());
	}

	@Test
	@DisplayName("Record 4487: Phone is 734-451-8950")
	void PhoneOfRecord4487() {
		assertEquals("734-451-8950", customers.get(4486).getPhone());
	}

	@Test
	@DisplayName("Record 4487: Fax is 734-451-6962")
	void FaxOfRecord4487() {
		assertEquals("734-451-6962", customers.get(4486).getFax());
	}

	@Test
	@DisplayName("Record 4487: Email is nichole@severi.com")
	void EmailOfRecord4487() {
		assertEquals("nichole@severi.com", customers.get(4486).getEmail());
	}

	@Test
	@DisplayName("Record 4487: Web is http://www.nicholeseveri.com")
	void WebOfRecord4487() {
		assertEquals("http://www.nicholeseveri.com", customers.get(4486).getWeb());
	}
}
