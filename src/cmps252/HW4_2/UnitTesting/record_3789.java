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

@Tag("8")
class Record_3789 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3789: FirstName is Cassandra")
	void FirstNameOfRecord3789() {
		assertEquals("Cassandra", customers.get(3788).getFirstName());
	}

	@Test
	@DisplayName("Record 3789: LastName is Encarnacion")
	void LastNameOfRecord3789() {
		assertEquals("Encarnacion", customers.get(3788).getLastName());
	}

	@Test
	@DisplayName("Record 3789: Company is Mcdonalds Restrnts")
	void CompanyOfRecord3789() {
		assertEquals("Mcdonalds Restrnts", customers.get(3788).getCompany());
	}

	@Test
	@DisplayName("Record 3789: Address is 410 Blue Bird St")
	void AddressOfRecord3789() {
		assertEquals("410 Blue Bird St", customers.get(3788).getAddress());
	}

	@Test
	@DisplayName("Record 3789: City is Apopka")
	void CityOfRecord3789() {
		assertEquals("Apopka", customers.get(3788).getCity());
	}

	@Test
	@DisplayName("Record 3789: County is Orange")
	void CountyOfRecord3789() {
		assertEquals("Orange", customers.get(3788).getCounty());
	}

	@Test
	@DisplayName("Record 3789: State is FL")
	void StateOfRecord3789() {
		assertEquals("FL", customers.get(3788).getState());
	}

	@Test
	@DisplayName("Record 3789: ZIP is 32703")
	void ZIPOfRecord3789() {
		assertEquals("32703", customers.get(3788).getZIP());
	}

	@Test
	@DisplayName("Record 3789: Phone is 407-889-1711")
	void PhoneOfRecord3789() {
		assertEquals("407-889-1711", customers.get(3788).getPhone());
	}

	@Test
	@DisplayName("Record 3789: Fax is 407-889-5977")
	void FaxOfRecord3789() {
		assertEquals("407-889-5977", customers.get(3788).getFax());
	}

	@Test
	@DisplayName("Record 3789: Email is cassandra@encarnacion.com")
	void EmailOfRecord3789() {
		assertEquals("cassandra@encarnacion.com", customers.get(3788).getEmail());
	}

	@Test
	@DisplayName("Record 3789: Web is http://www.cassandraencarnacion.com")
	void WebOfRecord3789() {
		assertEquals("http://www.cassandraencarnacion.com", customers.get(3788).getWeb());
	}
}
