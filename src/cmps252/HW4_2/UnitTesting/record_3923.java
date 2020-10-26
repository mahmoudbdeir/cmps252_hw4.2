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
class Record_3923 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3923: FirstName is Leonardo")
	void FirstNameOfRecord3923() {
		assertEquals("Leonardo", customers.get(3922).getFirstName());
	}

	@Test
	@DisplayName("Record 3923: LastName is Holeman")
	void LastNameOfRecord3923() {
		assertEquals("Holeman", customers.get(3922).getLastName());
	}

	@Test
	@DisplayName("Record 3923: Company is Environ Toxicology Intrntl Inc")
	void CompanyOfRecord3923() {
		assertEquals("Environ Toxicology Intrntl Inc", customers.get(3922).getCompany());
	}

	@Test
	@DisplayName("Record 3923: Address is 400 Maryland Dr")
	void AddressOfRecord3923() {
		assertEquals("400 Maryland Dr", customers.get(3922).getAddress());
	}

	@Test
	@DisplayName("Record 3923: City is Fort Washington")
	void CityOfRecord3923() {
		assertEquals("Fort Washington", customers.get(3922).getCity());
	}

	@Test
	@DisplayName("Record 3923: County is Montgomery")
	void CountyOfRecord3923() {
		assertEquals("Montgomery", customers.get(3922).getCounty());
	}

	@Test
	@DisplayName("Record 3923: State is PA")
	void StateOfRecord3923() {
		assertEquals("PA", customers.get(3922).getState());
	}

	@Test
	@DisplayName("Record 3923: ZIP is 19034")
	void ZIPOfRecord3923() {
		assertEquals("19034", customers.get(3922).getZIP());
	}

	@Test
	@DisplayName("Record 3923: Phone is 215-646-4863")
	void PhoneOfRecord3923() {
		assertEquals("215-646-4863", customers.get(3922).getPhone());
	}

	@Test
	@DisplayName("Record 3923: Fax is 215-646-4191")
	void FaxOfRecord3923() {
		assertEquals("215-646-4191", customers.get(3922).getFax());
	}

	@Test
	@DisplayName("Record 3923: Email is leonardo@holeman.com")
	void EmailOfRecord3923() {
		assertEquals("leonardo@holeman.com", customers.get(3922).getEmail());
	}

	@Test
	@DisplayName("Record 3923: Web is http://www.leonardoholeman.com")
	void WebOfRecord3923() {
		assertEquals("http://www.leonardoholeman.com", customers.get(3922).getWeb());
	}
}
