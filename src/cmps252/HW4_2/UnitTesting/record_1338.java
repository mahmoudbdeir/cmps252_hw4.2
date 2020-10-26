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
class Record_1338 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1338: FirstName is Scotty")
	void FirstNameOfRecord1338() {
		assertEquals("Scotty", customers.get(1337).getFirstName());
	}

	@Test
	@DisplayName("Record 1338: LastName is Conveniencia")
	void LastNameOfRecord1338() {
		assertEquals("Conveniencia", customers.get(1337).getLastName());
	}

	@Test
	@DisplayName("Record 1338: Company is Harris, Eddie J Esq")
	void CompanyOfRecord1338() {
		assertEquals("Harris, Eddie J Esq", customers.get(1337).getCompany());
	}

	@Test
	@DisplayName("Record 1338: Address is 303 Ross St")
	void AddressOfRecord1338() {
		assertEquals("303 Ross St", customers.get(1337).getAddress());
	}

	@Test
	@DisplayName("Record 1338: City is Amarillo")
	void CityOfRecord1338() {
		assertEquals("Amarillo", customers.get(1337).getCity());
	}

	@Test
	@DisplayName("Record 1338: County is Potter")
	void CountyOfRecord1338() {
		assertEquals("Potter", customers.get(1337).getCounty());
	}

	@Test
	@DisplayName("Record 1338: State is TX")
	void StateOfRecord1338() {
		assertEquals("TX", customers.get(1337).getState());
	}

	@Test
	@DisplayName("Record 1338: ZIP is 79102")
	void ZIPOfRecord1338() {
		assertEquals("79102", customers.get(1337).getZIP());
	}

	@Test
	@DisplayName("Record 1338: Phone is 806-374-4180")
	void PhoneOfRecord1338() {
		assertEquals("806-374-4180", customers.get(1337).getPhone());
	}

	@Test
	@DisplayName("Record 1338: Fax is 806-374-5614")
	void FaxOfRecord1338() {
		assertEquals("806-374-5614", customers.get(1337).getFax());
	}

	@Test
	@DisplayName("Record 1338: Email is scotty@conveniencia.com")
	void EmailOfRecord1338() {
		assertEquals("scotty@conveniencia.com", customers.get(1337).getEmail());
	}

	@Test
	@DisplayName("Record 1338: Web is http://www.scottyconveniencia.com")
	void WebOfRecord1338() {
		assertEquals("http://www.scottyconveniencia.com", customers.get(1337).getWeb());
	}
}
