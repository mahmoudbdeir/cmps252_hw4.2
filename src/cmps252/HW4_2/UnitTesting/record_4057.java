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

@Tag("39")
class Record_4057 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4057: FirstName is Janis")
	void FirstNameOfRecord4057() {
		assertEquals("Janis", customers.get(4056).getFirstName());
	}

	@Test
	@DisplayName("Record 4057: LastName is Hiott")
	void LastNameOfRecord4057() {
		assertEquals("Hiott", customers.get(4056).getLastName());
	}

	@Test
	@DisplayName("Record 4057: Company is Girl Scouts Of U S A")
	void CompanyOfRecord4057() {
		assertEquals("Girl Scouts Of U S A", customers.get(4056).getCompany());
	}

	@Test
	@DisplayName("Record 4057: Address is 2400 Crestview St")
	void AddressOfRecord4057() {
		assertEquals("2400 Crestview St", customers.get(4056).getAddress());
	}

	@Test
	@DisplayName("Record 4057: City is Kenner")
	void CityOfRecord4057() {
		assertEquals("Kenner", customers.get(4056).getCity());
	}

	@Test
	@DisplayName("Record 4057: County is Jefferson")
	void CountyOfRecord4057() {
		assertEquals("Jefferson", customers.get(4056).getCounty());
	}

	@Test
	@DisplayName("Record 4057: State is LA")
	void StateOfRecord4057() {
		assertEquals("LA", customers.get(4056).getState());
	}

	@Test
	@DisplayName("Record 4057: ZIP is 70062")
	void ZIPOfRecord4057() {
		assertEquals("70062", customers.get(4056).getZIP());
	}

	@Test
	@DisplayName("Record 4057: Phone is 504-465-9505")
	void PhoneOfRecord4057() {
		assertEquals("504-465-9505", customers.get(4056).getPhone());
	}

	@Test
	@DisplayName("Record 4057: Fax is 504-465-2561")
	void FaxOfRecord4057() {
		assertEquals("504-465-2561", customers.get(4056).getFax());
	}

	@Test
	@DisplayName("Record 4057: Email is janis@hiott.com")
	void EmailOfRecord4057() {
		assertEquals("janis@hiott.com", customers.get(4056).getEmail());
	}

	@Test
	@DisplayName("Record 4057: Web is http://www.janishiott.com")
	void WebOfRecord4057() {
		assertEquals("http://www.janishiott.com", customers.get(4056).getWeb());
	}
}
