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
class Record_4640 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4640: FirstName is Twila")
	void FirstNameOfRecord4640() {
		assertEquals("Twila", customers.get(4639).getFirstName());
	}

	@Test
	@DisplayName("Record 4640: LastName is Stoakley")
	void LastNameOfRecord4640() {
		assertEquals("Stoakley", customers.get(4639).getLastName());
	}

	@Test
	@DisplayName("Record 4640: Company is Smith, William S Esq")
	void CompanyOfRecord4640() {
		assertEquals("Smith, William S Esq", customers.get(4639).getCompany());
	}

	@Test
	@DisplayName("Record 4640: Address is 2939 Cameron St")
	void AddressOfRecord4640() {
		assertEquals("2939 Cameron St", customers.get(4639).getAddress());
	}

	@Test
	@DisplayName("Record 4640: City is Lafayette")
	void CityOfRecord4640() {
		assertEquals("Lafayette", customers.get(4639).getCity());
	}

	@Test
	@DisplayName("Record 4640: County is Lafayette")
	void CountyOfRecord4640() {
		assertEquals("Lafayette", customers.get(4639).getCounty());
	}

	@Test
	@DisplayName("Record 4640: State is LA")
	void StateOfRecord4640() {
		assertEquals("LA", customers.get(4639).getState());
	}

	@Test
	@DisplayName("Record 4640: ZIP is 70506")
	void ZIPOfRecord4640() {
		assertEquals("70506", customers.get(4639).getZIP());
	}

	@Test
	@DisplayName("Record 4640: Phone is 337-233-5956")
	void PhoneOfRecord4640() {
		assertEquals("337-233-5956", customers.get(4639).getPhone());
	}

	@Test
	@DisplayName("Record 4640: Fax is 337-233-9499")
	void FaxOfRecord4640() {
		assertEquals("337-233-9499", customers.get(4639).getFax());
	}

	@Test
	@DisplayName("Record 4640: Email is twila@stoakley.com")
	void EmailOfRecord4640() {
		assertEquals("twila@stoakley.com", customers.get(4639).getEmail());
	}

	@Test
	@DisplayName("Record 4640: Web is http://www.twilastoakley.com")
	void WebOfRecord4640() {
		assertEquals("http://www.twilastoakley.com", customers.get(4639).getWeb());
	}
}
