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

@Tag("3")
class Record_2234 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2234: FirstName is Janet")
	void FirstNameOfRecord2234() {
		assertEquals("Janet", customers.get(2233).getFirstName());
	}

	@Test
	@DisplayName("Record 2234: LastName is Driesenga")
	void LastNameOfRecord2234() {
		assertEquals("Driesenga", customers.get(2233).getLastName());
	}

	@Test
	@DisplayName("Record 2234: Company is Northern Rehabilitation Svc")
	void CompanyOfRecord2234() {
		assertEquals("Northern Rehabilitation Svc", customers.get(2233).getCompany());
	}

	@Test
	@DisplayName("Record 2234: Address is 44 Honeck St")
	void AddressOfRecord2234() {
		assertEquals("44 Honeck St", customers.get(2233).getAddress());
	}

	@Test
	@DisplayName("Record 2234: City is Englewood")
	void CityOfRecord2234() {
		assertEquals("Englewood", customers.get(2233).getCity());
	}

	@Test
	@DisplayName("Record 2234: County is Bergen")
	void CountyOfRecord2234() {
		assertEquals("Bergen", customers.get(2233).getCounty());
	}

	@Test
	@DisplayName("Record 2234: State is NJ")
	void StateOfRecord2234() {
		assertEquals("NJ", customers.get(2233).getState());
	}

	@Test
	@DisplayName("Record 2234: ZIP is 7631")
	void ZIPOfRecord2234() {
		assertEquals("7631", customers.get(2233).getZIP());
	}

	@Test
	@DisplayName("Record 2234: Phone is 201-569-2371")
	void PhoneOfRecord2234() {
		assertEquals("201-569-2371", customers.get(2233).getPhone());
	}

	@Test
	@DisplayName("Record 2234: Fax is 201-569-6644")
	void FaxOfRecord2234() {
		assertEquals("201-569-6644", customers.get(2233).getFax());
	}

	@Test
	@DisplayName("Record 2234: Email is janet@driesenga.com")
	void EmailOfRecord2234() {
		assertEquals("janet@driesenga.com", customers.get(2233).getEmail());
	}

	@Test
	@DisplayName("Record 2234: Web is http://www.janetdriesenga.com")
	void WebOfRecord2234() {
		assertEquals("http://www.janetdriesenga.com", customers.get(2233).getWeb());
	}
}
